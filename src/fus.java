public class fus extends fwq<bwm, fgn<bwm>> {
   public fus(fvk.a $$0) {
      super($$0, new fgn<>($$0.a(fka.n)), 0.4F);
      this.a(new fyu(this, $$0.f()));
   }

   public agg a(bwm $$0) {
      return $$0.gk();
   }

   protected void a(bwm $$0, enk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(bwm $$0, enk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.E($$4);
      if ($$5 > 0.0F) {
         $$1.a(0.4F * $$5, 0.15F * $$5, 0.1F * $$5);
         $$1.a(a.f.rotationDegrees(ati.j($$5, 0.0F, 90.0F)));
         ht $$6 = $$0.dl();

         for (cdm $$8 : $$0.dL().a(cdm.class, new ejd($$6).c(2.0, 2.0, 2.0))) {
            if ($$8.fD()) {
               $$1.a(0.15F * $$5, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
