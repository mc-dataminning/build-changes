import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hhx implements hhr {
   private static final int a = 16;
   private final hjc b;
   private final float c;
   private final float[] d;
   private final hhr[] e;
   private final hhr f;

   hhx(hjc $$0, float $$1, float[] $$2, hhr[] $$3, hhr $$4) {
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
   public void a(hhu $$0, daa $$1, hhs $$2, czy $$3, @Nullable gmd $$4, @Nullable bxw $$5, int $$6) {
      float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
      hhr $$8;
      if (Float.isNaN($$7)) {
         $$8 = this.f;
      } else {
         int $$9 = a(this.d, $$7);
         $$8 = $$9 == -1 ? this.f : this.e[$$9];
      }

      $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(float c, hhr.b d) {
      public static final Codec<hhx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("threshold").forGetter(hhx.a::a), hht.a.fieldOf("model").forGetter(hhx.a::b)).apply($$0, hhx.a::new)
      );
      public static final Comparator<hhx.a> b = Comparator.comparingDouble(hhx.a::a);

      public float a() {
         return (double)this.c;
      }

      public hhr.b b() {
         return this.d;
      }
   }

   public static record b(hjc b, float c, List<hhx.a> d, Optional<hhr.b> e) implements hhr.b {
      public static final MapCodec<hhx.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hjb.a.forGetter(hhx.b::b),
                  Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(hhx.b::c),
                  hhx.a.a.listOf().fieldOf("entries").forGetter(hhx.b::d),
                  hht.a.optionalFieldOf("fallback").forGetter(hhx.b::e)
               )
               .apply($$0, hhx.b::new)
      );

      @Override
      public MapCodec<hhx.b> a() {
         return a;
      }

      @Override
      public hhr a(hhr.a $$0) {
         float[] $$1 = new float[this.d.size()];
         hhr[] $$2 = new hhr[this.d.size()];
         List<hhx.a> $$3 = new ArrayList<>(this.d);
         $$3.sort(hhx.a.b);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            hhx.a $$5 = $$3.get($$4);
            $$1[$$4] = $$5.c;
            $$2[$$4] = $$5.d.a($$0);
         }

         hhr $$6 = this.e.<hhr>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return new hhx(this.b, this.c, $$1, $$2, $$6);
      }

      @Override
      public void a(hnt.a $$0) {
         this.e.ifPresent($$1 -> $$1.a($$0));
         this.d.forEach($$1 -> $$1.d.a($$0));
      }
   }
}
