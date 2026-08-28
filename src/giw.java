public class giw extends gku<cev, fub<cev>> {
   public giw(gjo.a $$0) {
      super($$0, new fub<>($$0.a(fxp.t)), 0.4F);
      this.a(new gnc(this, $$0.f()));
   }

   public akk a(cev $$0) {
      return $$0.gt();
   }

   protected void a(cev $$0, fao $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(cev $$0, fao $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.H($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(ayg.j($$6, 0.0F, 90.0F)));
         ja $$7 = $$0.dr();

         for (cml $$9 : $$0.dR().a(cml.class, new ewc($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fJ()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
