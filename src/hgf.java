import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hgf implements hfz {
   private static final int a = 16;
   private final hhk b;
   private final float c;
   private final float[] d;
   private final hfz[] e;
   private final hfz f;

   hgf(hhk $$0, float $$1, float[] $$2, hfz[] $$3, hfz $$4) {
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
   public void a(hgc $$0, czk $$1, hga $$2, czi $$3, @Nullable gkl $$4, @Nullable bxj $$5, int $$6) {
      float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
      hfz $$8;
      if (Float.isNaN($$7)) {
         $$8 = this.f;
      } else {
         int $$9 = a(this.d, $$7);
         $$8 = $$9 == -1 ? this.f : this.e[$$9];
      }

      $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(float c, hfz.b d) {
      public static final Codec<hgf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("threshold").forGetter(hgf.a::a), hgb.a.fieldOf("model").forGetter(hgf.a::b)).apply($$0, hgf.a::new)
      );
      public static final Comparator<hgf.a> b = Comparator.comparingDouble(hgf.a::a);

      public float a() {
         return (double)this.c;
      }

      public hfz.b b() {
         return this.d;
      }
   }

   public static record b(hhk b, float c, List<hgf.a> d, Optional<hfz.b> e) implements hfz.b {
      public static final MapCodec<hgf.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hhj.a.forGetter(hgf.b::b),
                  Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(hgf.b::c),
                  hgf.a.a.listOf().fieldOf("entries").forGetter(hgf.b::d),
                  hgb.a.optionalFieldOf("fallback").forGetter(hgf.b::e)
               )
               .apply($$0, hgf.b::new)
      );

      @Override
      public MapCodec<hgf.b> a() {
         return a;
      }

      @Override
      public hfz a(hfz.a $$0) {
         float[] $$1 = new float[this.d.size()];
         hfz[] $$2 = new hfz[this.d.size()];
         List<hgf.a> $$3 = new ArrayList<>(this.d);
         $$3.sort(hgf.a.b);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            hgf.a $$5 = $$3.get($$4);
            $$1[$$4] = $$5.c;
            $$2[$$4] = $$5.d.a($$0);
         }

         hfz $$6 = this.e.<hfz>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return new hgf(this.b, this.c, $$1, $$2, $$6);
      }

      @Override
      public void a(hmb.a $$0) {
         this.e.ifPresent($$1 -> $$1.a($$0));
         this.d.forEach($$1 -> $$1.d.a($$0));
      }
   }
}
