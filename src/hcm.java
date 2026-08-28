import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hcm extends hcs {
   public static final MapCodec<hcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hcs::b), hcm.a.e.fieldOf("target").forGetter(hcm::a)).apply($$0, hcm::new)
   );
   private final hcs.a b;
   private final hcs.a c;
   private final hcm.a d;
   private final azh e = azh.a();

   public hcm(boolean $$0, hcm.a $$1) {
      super($$0);
      this.b = this.a(0.8F);
      this.c = this.a(0.8F);
      this.d = $$1;
   }

   @Override
   protected float a(cwq $$0, gga $$1, int $$2, bum $$3) {
      jq $$4 = this.d.a($$1, $$0, $$3);
      long $$5 = $$1.ad();
      return !a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.c.a($$1)) {
         this.c.a($$1, this.e.i());
      }

      float $$2 = this.c.a() + (float)a($$0) / 2.1474836E9F;
      return ayz.b($$2, 1.0F);
   }

   private float a(bum $$0, long $$1, ji $$2) {
      float $$3 = (float)a($$0, $$2);
      float $$4 = a($$0);
      if ($$0 instanceof coy $$5 && $$5.c() && $$5.dV().u().i()) {
         if (this.b.a($$1)) {
            this.b.a($$1, 0.5F - ($$4 - 0.25F));
         }

         float $$6 = $$3 + this.b.a();
         return ayz.b($$6, 1.0F);
      }

      float $$7 = 0.5F - ($$4 - 0.25F - $$3);
      return ayz.b($$7, 1.0F);
   }

   private static boolean a(bum $$0, @Nullable jq $$1) {
      return $$1 != null && $$1.a() == $$0.dV().ai() && !($$1.b().b($$0.dt()) < 1.0E-5F);
   }

   private static double a(bum $$0, ji $$1) {
      fbb $$2 = fbb.b($$1);
      return Math.atan2($$2.c() - $$0.dG(), $$2.a() - $$0.dA()) / (float) (Math.PI * 2);
   }

   private static float a(bum $$0) {
      return ayz.b($$0.dM() / 360.0F, 1.0F);
   }

   private static int a(int $$0) {
      return $$0 * 1327217883;
   }

   protected hcm.a a() {
      return this.d;
   }

   public static enum a implements azv {
      a("none") {
         @Nullable
         @Override
         public jq a(gga $$0, cwq $$1, bum $$2) {
            return null;
         }
      },
      b("lodestone") {
         @Nullable
         @Override
         public jq a(gga $$0, cwq $$1, bum $$2) {
            czk $$3 = $$1.a(kv.ad);
            return $$3 != null ? $$3.a().orElse(null) : null;
         }
      },
      c("spawn") {
         @Override
         public jq a(gga $$0, cwq $$1, bum $$2) {
            return jq.a($$0.ai(), $$0.Z());
         }
      },
      d("recovery") {
         @Nullable
         @Override
         public jq a(gga $$0, cwq $$1, bum $$2) {
            return $$2 instanceof coy $$3 ? $$3.gI().orElse(null) : null;
         }
      };

      public static final Codec<hcm.a> e = azv.a(hcm.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Nullable
      abstract jq a(gga var1, cwq var2, bum var3);
   }
}
