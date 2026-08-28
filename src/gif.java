public class gif extends gkd<cfi, ftl<cfi>> {
   public gif(gix.a $$0) {
      super($$0, new ftl<>($$0.a(fwz.t)), 0.4F);
      this.a(new gml(this, $$0.f()));
   }

   public alf a(cfi $$0) {
      return $$0.gw();
   }

   protected void a(cfi $$0, ezy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(cfi $$0, ezy $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.G($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(ayz.j($$6, 0.0F, 90.0F)));
         iz $$7 = $$0.dp();

         for (cmx $$9 : $$0.dP().a(cmx.class, new evm($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fL()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
