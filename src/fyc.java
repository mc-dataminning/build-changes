import javax.annotation.Nullable;

public class fyc extends fzs {
   private final float a;
   private final fzn b;

   fyc(fvm $$0, double $$1, double $$2, double $$3, float $$4, float $$5, float $$6, fzn $$7) {
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
   public fyw b() {
      return fyw.b;
   }

   @Override
   public float b(float $$0) {
      return this.D * axw.a(((float)this.s + $$0) / (float)this.t * 32.0F, 0.0F, 1.0F);
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

   public static class a implements fyv<kn> {
      private final fzn a;

      public a(fzn $$0) {
         this.a = $$0;
      }

      @Nullable
      public fys a(kn $$0, fvm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         dpy $$8 = $$0.b();
         if (!$$8.i() && $$8.l() == djb.a) {
            return null;
         } else {
            im $$9 = im.a($$2, $$3, $$4);
            int $$10 = fcu.Q().aw().a($$8, $$1, $$9);
            if ($$8.b() instanceof dfr) {
               $$10 = ((dfr)$$8.b()).b($$8, $$1, $$9);
            }

            float $$11 = (float)($$10 >> 16 & 0xFF) / 255.0F;
            float $$12 = (float)($$10 >> 8 & 0xFF) / 255.0F;
            float $$13 = (float)($$10 & 0xFF) / 255.0F;
            return new fyc($$1, $$2, $$3, $$4, $$11, $$12, $$13, this.a);
         }
      }
   }
}
