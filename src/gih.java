public class gih extends gkf<cfk, ftn<cfk>> {
   public gih(giz.a $$0) {
      super($$0, new ftn<>($$0.a(fxb.t)), 0.4F);
      this.a(new gmn(this, $$0.f()));
   }

   public alf a(cfk $$0) {
      return $$0.gw();
   }

   protected void a(cfk $$0, faa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(cfk $$0, faa $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.G($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(ayz.j($$6, 0.0F, 90.0F)));
         iz $$7 = $$0.dp();

         for (cmz $$9 : $$0.dP().a(cmz.class, new evo($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fL()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
