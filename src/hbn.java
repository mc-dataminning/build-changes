import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hbn implements hbi {
   private static final int a = 16;
   private final hcp b;
   private final float c;
   private final float[] d;
   private final hbi[] e;
   private final hbi f;

   hbn(hcp $$0, float $$1, float[] $$2, hbi[] $$3, hbi $$4) {
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
   public void a(hbl $$0, cwp $$1, hbj $$2, cwn $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
      float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
      hbi $$8;
      if (Float.isNaN($$7)) {
         $$8 = this.f;
      } else {
         int $$9 = a(this.d, $$7);
         $$8 = $$9 == -1 ? this.f : this.e[$$9];
      }

      $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(float c, hbi.b d) {
      public static final Codec<hbn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("threshold").forGetter(hbn.a::a), hbk.a.fieldOf("model").forGetter(hbn.a::b)).apply($$0, hbn.a::new)
      );
      public static final Comparator<hbn.a> b = Comparator.comparingDouble(hbn.a::a);

      public float a() {
         return (double)this.c;
      }

      public hbi.b b() {
         return this.d;
      }
   }

   public static record b(hcp b, float c, List<hbn.a> d, Optional<hbi.b> e) implements hbi.b {
      public static final MapCodec<hbn.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hco.a.forGetter(hbn.b::b),
                  Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(hbn.b::c),
                  hbn.a.a.listOf().fieldOf("entries").forGetter(hbn.b::d),
                  hbk.a.optionalFieldOf("fallback").forGetter(hbn.b::e)
               )
               .apply($$0, hbn.b::new)
      );

      @Override
      public MapCodec<hbn.b> a() {
         return a;
      }

      @Override
      public hbi a(hbi.a $$0) {
         float[] $$1 = new float[this.d.size()];
         hbi[] $$2 = new hbi[this.d.size()];
         List<hbn.a> $$3 = new ArrayList<>(this.d);
         $$3.sort(hbn.a.b);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            hbn.a $$5 = $$3.get($$4);
            $$1[$$4] = $$5.c;
            $$2[$$4] = $$5.d.a($$0);
         }

         hbi $$6 = this.e.<hbi>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return new hbn(this.b, this.c, $$1, $$2, $$6);
      }

      @Override
      public void a(hhd.a $$0) {
         this.e.ifPresent($$1 -> $$1.a($$0));
         this.d.forEach($$1 -> $$1.d.a($$0));
      }
   }
}
