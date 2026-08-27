public class gfn extends gfh<cgc> {
   private final gat a;

   public gfn(gfi.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cgc $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      doz $$6 = $$0.u();
      if ($$6.l() == did.c) {
         cyx $$7 = $$0.dM();
         if ($$6 != $$7.a_($$0.dm()) && $$6.l() != did.a) {
            $$3.a();
            ib $$8 = ib.a($$0.dr(), $$0.cH().e, $$0.dx());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fzu.b($$6)), false, axr.a(), $$6.a($$0.p()), gla.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public ajt a(cgc $$0) {
      return gli.e;
   }
}
