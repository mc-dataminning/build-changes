import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hcg extends hcm {
   public static final MapCodec<hcg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hcm::b), hcg.a.d.fieldOf("target").forGetter(hcg::a)).apply($$0, hcg::new)
   );
   private final hcm.a b;
   private final hcm.a c;
   private final hcg.a d;
   private final azg e = azg.a();

   public hcg(boolean $$0, hcg.a $$1) {
      super($$0);
      this.b = this.a(0.8F);
      this.c = this.a(0.8F);
      this.d = $$1;
   }

   @Override
   protected float a(cwn $$0, gfw $$1, int $$2, buj $$3) {
      jq $$4 = this.d.a($$1, $$0, $$3);
      long $$5 = $$1.ad();
      return !a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.c.a($$1)) {
         this.c.a($$1, this.e.i());
      }

      float $$2 = this.c.a() + (float)a($$0) / 2.1474836E9F;
      return ayy.b($$2, 1.0F);
   }

   private float a(buj $$0, long $$1, ji $$2) {
      float $$3 = (float)a($$0, $$2);
      float $$4 = a($$0);
      if ($$0 instanceof cov $$5 && $$5.c() && $$5.dW().u().i()) {
         if (this.b.a($$1)) {
            this.b.a($$1, 0.5F - ($$4 - 0.25F));
         }

         float $$6 = $$3 + this.b.a();
         return ayy.b($$6, 1.0F);
      }

      float $$7 = 0.5F - ($$4 - 0.25F - $$3);
      return ayy.b($$7, 1.0F);
   }

   private static boolean a(buj $$0, @Nullable jq $$1) {
      return $$1 != null && $$1.a() == $$0.dW().ai() && !($$1.b().b($$0.du()) < 1.0E-5F);
   }

   private static double a(buj $$0, ji $$1) {
      fay $$2 = fay.b($$1);
      return Math.atan2($$2.c() - $$0.dH(), $$2.a() - $$0.dB()) / (float) (Math.PI * 2);
   }

   private static float a(buj $$0) {
      return ayy.b($$0.dN() / 360.0F, 1.0F);
   }

   private static int a(int $$0) {
      return $$0 * 1327217883;
   }

   protected hcg.a a() {
      return this.d;
   }

   public static enum a implements azu {
      a("lodestone") {
         @Nullable
         @Override
         public jq a(gfw $$0, cwn $$1, buj $$2) {
            czh $$3 = $$1.a(kv.ad);
            return $$3 != null ? $$3.a().orElse(null) : null;
         }
      },
      b("spawn") {
         @Nullable
         @Override
         public jq a(gfw $$0, cwn $$1, buj $$2) {
            return cvb.a($$0);
         }
      },
      c("recovery") {
         @Nullable
         @Override
         public jq a(gfw $$0, cwn $$1, buj $$2) {
            return $$2 instanceof cov $$3 ? $$3.gI().orElse(null) : null;
         }
      };

      public static final Codec<hcg.a> d = azu.a(hcg.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      @Nullable
      abstract jq a(gfw var1, cwn var2, buj var3);
   }
}
