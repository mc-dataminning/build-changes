import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hfk implements hff {
   private static final int a = 16;
   private final hgp b;
   private final float c;
   private final float[] d;
   private final hff[] e;
   private final hff f;

   hfk(hgp $$0, float $$1, float[] $$2, hff[] $$3, hff $$4) {
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
   public void a(hfi $$0, cyy $$1, hfg $$2, cyw $$3, @Nullable gjr $$4, @Nullable bxc $$5, int $$6) {
      float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
      hff $$8;
      if (Float.isNaN($$7)) {
         $$8 = this.f;
      } else {
         int $$9 = a(this.d, $$7);
         $$8 = $$9 == -1 ? this.f : this.e[$$9];
      }

      $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(float c, hff.b d) {
      public static final Codec<hfk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("threshold").forGetter(hfk.a::a), hfh.a.fieldOf("model").forGetter(hfk.a::b)).apply($$0, hfk.a::new)
      );
      public static final Comparator<hfk.a> b = Comparator.comparingDouble(hfk.a::a);

      public float a() {
         return (double)this.c;
      }

      public hff.b b() {
         return this.d;
      }
   }

   public static record b(hgp b, float c, List<hfk.a> d, Optional<hff.b> e) implements hff.b {
      public static final MapCodec<hfk.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hgo.a.forGetter(hfk.b::b),
                  Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(hfk.b::c),
                  hfk.a.a.listOf().fieldOf("entries").forGetter(hfk.b::d),
                  hfh.a.optionalFieldOf("fallback").forGetter(hfk.b::e)
               )
               .apply($$0, hfk.b::new)
      );

      @Override
      public MapCodec<hfk.b> a() {
         return a;
      }

      @Override
      public hff a(hff.a $$0) {
         float[] $$1 = new float[this.d.size()];
         hff[] $$2 = new hff[this.d.size()];
         List<hfk.a> $$3 = new ArrayList<>(this.d);
         $$3.sort(hfk.a.b);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            hfk.a $$5 = $$3.get($$4);
            $$1[$$4] = $$5.c;
            $$2[$$4] = $$5.d.a($$0);
         }

         hff $$6 = this.e.<hff>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return new hfk(this.b, this.c, $$1, $$2, $$6);
      }

      @Override
      public void a(hlh.a $$0) {
         this.e.ifPresent($$1 -> $$1.a($$0));
         this.d.forEach($$1 -> $$1.d.a($$0));
      }
   }
}
