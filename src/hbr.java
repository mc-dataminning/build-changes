import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hbr implements hbm {
   private static final int a = 16;
   private final hcu b;
   private final float c;
   private final float[] d;
   private final hbm[] e;
   private final hbm f;

   hbr(hcu $$0, float $$1, float[] $$2, hbm[] $$3, hbm $$4) {
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
   public void a(hbp $$0, cwq $$1, hbn $$2, cwo $$3, @Nullable gga $$4, @Nullable bvi $$5, int $$6) {
      float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
      hbm $$8;
      if (Float.isNaN($$7)) {
         $$8 = this.f;
      } else {
         int $$9 = a(this.d, $$7);
         $$8 = $$9 == -1 ? this.f : this.e[$$9];
      }

      $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(float c, hbm.b d) {
      public static final Codec<hbr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("threshold").forGetter(hbr.a::a), hbo.a.fieldOf("model").forGetter(hbr.a::b)).apply($$0, hbr.a::new)
      );
      public static final Comparator<hbr.a> b = Comparator.comparingDouble(hbr.a::a);

      public float a() {
         return (double)this.c;
      }

      public hbm.b b() {
         return this.d;
      }
   }

   public static record b(hcu b, float c, List<hbr.a> d, Optional<hbm.b> e) implements hbm.b {
      public static final MapCodec<hbr.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hct.a.forGetter(hbr.b::b),
                  Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(hbr.b::c),
                  hbr.a.a.listOf().fieldOf("entries").forGetter(hbr.b::d),
                  hbo.a.optionalFieldOf("fallback").forGetter(hbr.b::e)
               )
               .apply($$0, hbr.b::new)
      );

      @Override
      public MapCodec<hbr.b> a() {
         return a;
      }

      @Override
      public hbm a(hbm.a $$0) {
         float[] $$1 = new float[this.d.size()];
         hbm[] $$2 = new hbm[this.d.size()];
         List<hbr.a> $$3 = new ArrayList<>(this.d);
         $$3.sort(hbr.a.b);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            hbr.a $$5 = $$3.get($$4);
            $$1[$$4] = $$5.c;
            $$2[$$4] = $$5.d.a($$0);
         }

         hbm $$6 = this.e.<hbm>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return new hbr(this.b, this.c, $$1, $$2, $$6);
      }

      @Override
      public void a(hhl.a $$0) {
         this.e.ifPresent($$1 -> $$1.a($$0));
         this.d.forEach($$1 -> $$1.d.a($$0));
      }
   }
}
