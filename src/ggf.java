public class ggf extends gid<cds, frm<cds>> {
   public ggf(ggx.a $$0) {
      super($$0, new frm<>($$0.a(fva.t)), 0.4F);
      this.a(new gkk(this, $$0.f()));
   }

   public akh a(cds $$0) {
      return $$0.gv();
   }

   protected void a(cds $$0, exx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(cds $$0, exx $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.G($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(axz.j($$6, 0.0F, 90.0F)));
         in $$7 = $$0.dn();

         for (clh $$9 : $$0.dN().a(clh.class, new etk($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fJ()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
