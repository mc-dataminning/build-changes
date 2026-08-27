public class fxv extends fzt<byb, fji<byb>> {
   public fxv(fyn.a $$0) {
      super($$0, new fji<>($$0.a(fmw.q)), 0.4F);
      this.a(new gca(this, $$0.f()));
   }

   public ahg a(byb $$0) {
      return $$0.gk();
   }

   protected void a(byb $$0, eqb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(byb $$0, eqb $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.E($$4);
      if ($$5 > 0.0F) {
         $$1.a(0.4F * $$5, 0.15F * $$5, 0.1F * $$5);
         $$1.a(a.f.rotationDegrees(auo.j($$5, 0.0F, 90.0F)));
         hx $$6 = $$0.dm();

         for (cfi $$8 : $$0.dM().a(cfi.class, new elo($$6).c(2.0, 2.0, 2.0))) {
            if ($$8.fD()) {
               $$1.a(0.15F * $$5, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
