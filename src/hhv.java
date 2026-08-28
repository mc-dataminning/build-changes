import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hhv implements hhp {
   private static final int a = 16;
   private final hja b;
   private final float c;
   private final float[] d;
   private final hhp[] e;
   private final hhp f;

   hhv(hja $$0, float $$1, float[] $$2, hhp[] $$3, hhp $$4) {
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
   public void a(hhs $$0, czy $$1, hhq $$2, czw $$3, @Nullable gmb $$4, @Nullable bxu $$5, int $$6) {
      float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
      hhp $$8;
      if (Float.isNaN($$7)) {
         $$8 = this.f;
      } else {
         int $$9 = a(this.d, $$7);
         $$8 = $$9 == -1 ? this.f : this.e[$$9];
      }

      $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(float c, hhp.b d) {
      public static final Codec<hhv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("threshold").forGetter(hhv.a::a), hhr.a.fieldOf("model").forGetter(hhv.a::b)).apply($$0, hhv.a::new)
      );
      public static final Comparator<hhv.a> b = Comparator.comparingDouble(hhv.a::a);

      public float a() {
         return (double)this.c;
      }

      public hhp.b b() {
         return this.d;
      }
   }

   public static record b(hja b, float c, List<hhv.a> d, Optional<hhp.b> e) implements hhp.b {
      public static final MapCodec<hhv.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hiz.a.forGetter(hhv.b::b),
                  Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(hhv.b::c),
                  hhv.a.a.listOf().fieldOf("entries").forGetter(hhv.b::d),
                  hhr.a.optionalFieldOf("fallback").forGetter(hhv.b::e)
               )
               .apply($$0, hhv.b::new)
      );

      @Override
      public MapCodec<hhv.b> a() {
         return a;
      }

      @Override
      public hhp a(hhp.a $$0) {
         float[] $$1 = new float[this.d.size()];
         hhp[] $$2 = new hhp[this.d.size()];
         List<hhv.a> $$3 = new ArrayList<>(this.d);
         $$3.sort(hhv.a.b);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            hhv.a $$5 = $$3.get($$4);
            $$1[$$4] = $$5.c;
            $$2[$$4] = $$5.d.a($$0);
         }

         hhp $$6 = this.e.<hhp>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return new hhv(this.b, this.c, $$1, $$2, $$6);
      }

      @Override
      public void a(hnr.a $$0) {
         this.e.ifPresent($$1 -> $$1.a($$0));
         this.d.forEach($$1 -> $$1.d.a($$0));
      }
   }
}
