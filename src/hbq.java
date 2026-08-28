import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hbq implements hbl {
   private static final int a = 16;
   private final hct b;
   private final float c;
   private final float[] d;
   private final hbl[] e;
   private final hbl f;

   hbq(hct $$0, float $$1, float[] $$2, hbl[] $$3, hbl $$4) {
      this.b = $$0;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.c = $$1;
   }

   private static int a(float[] $$0, float $$1) {
      if ($$0.length < 16) {
         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            if ($$0[$$2] > $$1) {
               return $$2 - 1;
            }
         }

         return $$0.length - 1;
      } else {
         int $$3 = Arrays.binarySearch($$0, $$1);
         if ($$3 < 0) {
            int $$4 = ~$$3;
            return $$4 - 1;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public void a(hbo $$0, cwp $$1, hbm $$2, cwn $$3, @Nullable gfz $$4, @Nullable bvh $$5, int $$6) {
      float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
      hbl $$8;
      if (Float.isNaN($$7)) {
         $$8 = this.f;
      } else {
         int $$9 = a(this.d, $$7);
         $$8 = $$9 == -1 ? this.f : this.e[$$9];
      }

      $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(float c, hbl.b d) {
      public static final Codec<hbq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("threshold").forGetter(hbq.a::a), hbn.a.fieldOf("model").forGetter(hbq.a::b)).apply($$0, hbq.a::new)
      );
      public static final Comparator<hbq.a> b = Comparator.comparingDouble(hbq.a::a);

      public float a() {
         return (double)this.c;
      }

      public hbl.b b() {
         return this.d;
      }
   }

   public static record b(hct b, float c, List<hbq.a> d, Optional<hbl.b> e) implements hbl.b {
      public static final MapCodec<hbq.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hcs.a.forGetter(hbq.b::b),
                  Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(hbq.b::c),
                  hbq.a.a.listOf().fieldOf("entries").forGetter(hbq.b::d),
                  hbn.a.optionalFieldOf("fallback").forGetter(hbq.b::e)
               )
               .apply($$0, hbq.b::new)
      );

      @Override
      public MapCodec<hbq.b> a() {
         return a;
      }

      @Override
      public hbl a(hbl.a $$0) {
         float[] $$1 = new float[this.d.size()];
         hbl[] $$2 = new hbl[this.d.size()];
         List<hbq.a> $$3 = new ArrayList<>(this.d);
         $$3.sort(hbq.a.b);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            hbq.a $$5 = $$3.get($$4);
            $$1[$$4] = $$5.c;
            $$2[$$4] = $$5.d.a($$0);
         }

         hbl $$6 = this.e.<hbl>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return new hbq(this.b, this.c, $$1, $$2, $$6);
      }

      @Override
      public void a(hhk.a $$0) {
         this.e.ifPresent($$1 -> $$1.a($$0));
         this.d.forEach($$1 -> $$1.d.a($$0));
      }
   }
}
