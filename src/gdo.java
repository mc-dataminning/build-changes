public class gdo extends gft {
   gdo(gbm $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3);
      this.u = -0.125F;
      this.B = 0.85F;
      this.b(0.02F, 0.02F);
      this.D = this.D * (this.r.i() * 0.6F + 0.2F);
      this.j = $$4 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.k = $$5 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.l = $$6 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.t = (int)(40.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public void a() {
      super.a();
      if (!this.o && !this.c.b_(jf.a(this.g, this.h, this.i)).a(axb.a)) {
         this.k();
      }
   }

   @Override
   public gex b() {
      return gex.b;
   }

   public static class a implements gew<ls> {
      private final gfo a;

      public a(gfo $$0) {
         this.a = $$0;
      }

      public get a(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gdo $$8 = new gdo($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
