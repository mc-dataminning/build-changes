public class fxn extends fzl<bxv, fja<bxv>> {
   public fxn(fyf.a $$0) {
      super($$0, new fja<>($$0.a(fmo.q)), 0.4F);
      this.a(new gbs(this, $$0.f()));
   }

   public ahd a(bxv $$0) {
      return $$0.gk();
   }

   protected void a(bxv $$0, ept $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(bxv $$0, ept $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.E($$4);
      if ($$5 > 0.0F) {
         $$1.a(0.4F * $$5, 0.15F * $$5, 0.1F * $$5);
         $$1.a(a.f.rotationDegrees(aui.j($$5, 0.0F, 90.0F)));
         hx $$6 = $$0.dm();

         for (cfb $$8 : $$0.dM().a(cfb.class, new elh($$6).c(2.0, 2.0, 2.0))) {
            if ($$8.fD()) {
               $$1.a(0.15F * $$5, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
