import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hgl implements hgf {
   private static final int a = 16;
   private final hhq b;
   private final float c;
   private final float[] d;
   private final hgf[] e;
   private final hgf f;

   hgl(hhq $$0, float $$1, float[] $$2, hgf[] $$3, hgf $$4) {
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
   public void a(hgi $$0, czn $$1, hgg $$2, czl $$3, @Nullable gkq $$4, @Nullable bxj $$5, int $$6) {
      float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
      hgf $$8;
      if (Float.isNaN($$7)) {
         $$8 = this.f;
      } else {
         int $$9 = a(this.d, $$7);
         $$8 = $$9 == -1 ? this.f : this.e[$$9];
      }

      $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(float c, hgf.b d) {
      public static final Codec<hgl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("threshold").forGetter(hgl.a::a), hgh.a.fieldOf("model").forGetter(hgl.a::b)).apply($$0, hgl.a::new)
      );
      public static final Comparator<hgl.a> b = Comparator.comparingDouble(hgl.a::a);

      public float a() {
         return (double)this.c;
      }

      public hgf.b b() {
         return this.d;
      }
   }

   public static record b(hhq b, float c, List<hgl.a> d, Optional<hgf.b> e) implements hgf.b {
      public static final MapCodec<hgl.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hhp.a.forGetter(hgl.b::b),
                  Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(hgl.b::c),
                  hgl.a.a.listOf().fieldOf("entries").forGetter(hgl.b::d),
                  hgh.a.optionalFieldOf("fallback").forGetter(hgl.b::e)
               )
               .apply($$0, hgl.b::new)
      );

      @Override
      public MapCodec<hgl.b> a() {
         return a;
      }

      @Override
      public hgf a(hgf.a $$0) {
         float[] $$1 = new float[this.d.size()];
         hgf[] $$2 = new hgf[this.d.size()];
         List<hgl.a> $$3 = new ArrayList<>(this.d);
         $$3.sort(hgl.a.b);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            hgl.a $$5 = $$3.get($$4);
            $$1[$$4] = $$5.c;
            $$2[$$4] = $$5.d.a($$0);
         }

         hgf $$6 = this.e.<hgf>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return new hgl(this.b, this.c, $$1, $$2, $$6);
      }

      @Override
      public void a(hmi.a $$0) {
         this.e.ifPresent($$1 -> $$1.a($$0));
         this.d.forEach($$1 -> $$1.d.a($$0));
      }
   }
}
