import javax.annotation.Nullable;

public class gmp extends goi {
   private final float a;
   private final god b;

   gmp(gjz $$0, double $$1, double $$2, double $$3, float $$4, float $$5, float $$6, god $$7) {
      super($$0, $$1, $$2, $$3);
      this.b = $$7;
      this.v = $$4;
      this.w = $$5;
      this.x = $$6;
      float $$8 = 0.9F;
      this.D *= 0.67499995F;
      int $$9 = (int)(32.0 / (Math.random() * 0.8 + 0.2));
      this.t = (int)Math.max((float)$$9 * 0.9F, 1.0F);
      this.b($$7);
      this.a = ((float)Math.random() - 0.5F) * 0.1F;
      this.z = (float)Math.random() * (float) (Math.PI * 2);
   }

   @Override
   public gnm b() {
      return gnm.b;
   }

   @Override
   public float b(float $$0) {
      return this.D * azm.a(((float)this.s + $$0) / (float)this.t * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.b(this.b);
         this.A = this.z;
         this.z = this.z + (float) Math.PI * this.a * 2.0F;
         if (this.m) {
            this.A = this.z = 0.0F;
         }

         this.a(this.j, this.k, this.l);
         this.k -= 0.003F;
         this.k = Math.max(this.k, -0.14F);
      }
   }

   public static class a implements gnl<lp> {
      private final god a;

      public a(god $$0) {
         this.a = $$0;
      }

      @Nullable
      public gni a(lp $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         eah $$8 = $$0.b();
         if (!$$8.l() && $$8.o() == dss.a) {
            return null;
         } else {
            iu $$9 = iu.a($$2, $$3, $$4);
            int $$10 = foz.Q().aw().a($$8, $$1, $$9);
            if ($$8.b() instanceof dpd) {
               $$10 = ((dpd)$$8.b()).b($$8, $$1, $$9);
            }

            float $$11 = (float)($$10 >> 16 & 0xFF) / 255.0F;
            float $$12 = (float)($$10 >> 8 & 0xFF) / 255.0F;
            float $$13 = (float)($$10 & 0xFF) / 255.0F;
            return new gmp($$1, $$2, $$3, $$4, $$11, $$12, $$13, this.a);
         }
      }
   }
}
