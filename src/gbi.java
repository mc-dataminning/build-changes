public class gbi extends gcd {
   private final gby a;

   gbi(fxw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gby $$7) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.B = 0.96F;
      this.a = $$7;
      float $$8 = 2.5F;
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
      float $$9 = 1.0F - (float)(Math.random() * 0.3F);
      this.v = $$9;
      this.w = $$9;
      this.x = $$9;
      this.D *= 1.875F;
      int $$10 = (int)(8.0 / (Math.random() * 0.8 + 0.3));
      this.t = (int)Math.max((float)$$10 * 2.5F, 1.0F);
      this.n = false;
      this.b($$7);
   }

   @Override
   public gbh b() {
      return gbh.c;
   }

   @Override
   public float b(float $$0) {
      return this.D * ayz.a(((float)this.s + $$0) / (float)this.t * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public void a() {
      super.a();
      if (!this.o) {
         this.b(this.a);
         cmy $$0 = this.c.a(this.g, this.h, this.i, 2.0, false);
         if ($$0 != null) {
            double $$1 = $$0.dw();
            if (this.h > $$1) {
               this.h = this.h + ($$1 - this.h) * 0.2;
               this.k = this.k + ($$0.ds().d - this.k) * 0.2;
               this.c(this.g, this.h, this.i);
            }
         }
      }
   }

   public static class a implements gbg<lm> {
      private final gby a;

      public a(gby $$0) {
         this.a = $$0;
      }

      public gbd a(lm $$0, fxw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbi($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class b implements gbg<lm> {
      private final gby a;

      public b(gby $$0) {
         this.a = $$0;
      }

      public gbd a(lm $$0, fxw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbd $$8 = new gbi($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a(200.0F, 50.0F, 120.0F);
         $$8.e(0.4F);
         return $$8;
      }
   }
}
