public class gdd extends gcx<cfc> {
   private final fyk a;

   public gdd(gcy.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cfc $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      dmz $$6 = $$0.s();
      if ($$6.l() == dgf.c) {
         cwz $$7 = $$0.dM();
         if ($$6 != $$7.a_($$0.dm()) && $$6.l() != dgf.a) {
            $$3.a();
            ib $$8 = ib.a($$0.dr(), $$0.cH().e, $$0.dx());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fxl.b($$6)), false, axd.a(), $$6.a($$0.p()), giq.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public ajh a(cfc $$0) {
      return giy.e;
   }
}
