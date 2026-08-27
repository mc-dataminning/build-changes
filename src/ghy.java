public class ghy extends ghs<cih> {
   private final gde a;

   public ghy(ght.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cih $$0, float $$1, float $$2, eyu $$3, gck $$4, int $$5) {
      drd $$6 = $$0.u();
      if ($$6.l() == dkg.c) {
         daz $$7 = $$0.dP();
         if ($$6 != $$7.a_($$0.dp()) && $$6.l() != dkg.a) {
            $$3.a();
            io $$8 = io.a($$0.du(), $$0.cK().e, $$0.dA());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(gcf.b($$6)), false, aym.a(), $$6.a($$0.p()), gnm.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public akn a(cih $$0) {
      return gnu.e;
   }
}
