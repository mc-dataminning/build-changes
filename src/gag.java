public class gag extends gcl {
   gag(fyd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
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
      if (!this.o && !this.c.b_(ja.a(this.g, this.h, this.i)).a(awa.a)) {
         this.k();
      }
   }

   @Override
   public gbp b() {
      return gbp.b;
   }

   public static class a implements gbo<ln> {
      private final gcg a;

      public a(gcg $$0) {
         this.a = $$0;
      }

      public gbl a(ln $$0, fyd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gag $$8 = new gag($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
