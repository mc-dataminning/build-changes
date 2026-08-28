import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hck extends hcq {
   public static final MapCodec<hck> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hcq::b), hck.a.e.fieldOf("target").forGetter(hck::a)).apply($$0, hck::new)
   );
   private final hcq.a b;
   private final hcq.a c;
   private final hck.a d;
   private final azh e = azh.a();

   public hck(boolean $$0, hck.a $$1) {
      super($$0);
      this.b = this.a(0.8F);
      this.c = this.a(0.8F);
      this.d = $$1;
   }

   @Override
   protected float a(cwo $$0, gfy $$1, int $$2, buk $$3) {
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

   private float a(buk $$0, long $$1, ji $$2) {
      float $$3 = (float)a($$0, $$2);
      float $$4 = a($$0);
      if ($$0 instanceof cow $$5 && $$5.c() && $$5.dV().u().i()) {
         if (this.b.a($$1)) {
            this.b.a($$1, 0.5F - ($$4 - 0.25F));
         }

         float $$6 = $$3 + this.b.a();
         return ayz.b($$6, 1.0F);
      }

      float $$7 = 0.5F - ($$4 - 0.25F - $$3);
      return ayz.b($$7, 1.0F);
   }

   private static boolean a(buk $$0, @Nullable jq $$1) {
      return $$1 != null && $$1.a() == $$0.dV().ai() && !($$1.b().b($$0.dt()) < 1.0E-5F);
   }

   private static double a(buk $$0, ji $$1) {
      faz $$2 = faz.b($$1);
      return Math.atan2($$2.c() - $$0.dG(), $$2.a() - $$0.dA()) / (float) (Math.PI * 2);
   }

   private static float a(buk $$0) {
      return ayz.b($$0.dM() / 360.0F, 1.0F);
   }

   private static int a(int $$0) {
      return $$0 * 1327217883;
   }

   protected hck.a a() {
      return this.d;
   }

   public static enum a implements azv {
      a("none") {
         @Nullable
         @Override
         public jq a(gfy $$0, cwo $$1, buk $$2) {
            return null;
         }
      },
      b("lodestone") {
         @Nullable
         @Override
         public jq a(gfy $$0, cwo $$1, buk $$2) {
            czi $$3 = $$1.a(kv.ad);
            return $$3 != null ? $$3.a().orElse(null) : null;
         }
      },
      c("spawn") {
         @Override
         public jq a(gfy $$0, cwo $$1, buk $$2) {
            return jq.a($$0.ai(), $$0.Z());
         }
      },
      d("recovery") {
         @Nullable
         @Override
         public jq a(gfy $$0, cwo $$1, buk $$2) {
            return $$2 instanceof cow $$3 ? $$3.gI().orElse(null) : null;
         }
      };

      public static final Codec<hck.a> e = azv.a(hck.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Nullable
      abstract jq a(gfy var1, cwo var2, buk var3);
   }
}
