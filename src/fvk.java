public class fvk extends fxi<bwz, fhf<bwz>> {
   public fvk(fwc.a $$0) {
      super($$0, new fhf<>($$0.a(fks.n)), 0.4F);
      this.a(new fzm(this, $$0.f()));
   }

   public agm a(bwz $$0) {
      return $$0.gl();
   }

   protected void a(bwz $$0, eob $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(bwz $$0, eob $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.E($$4);
      if ($$5 > 0.0F) {
         $$1.a(0.4F * $$5, 0.15F * $$5, 0.1F * $$5);
         $$1.a(a.f.rotationDegrees(atq.j($$5, 0.0F, 90.0F)));
         hx $$6 = $$0.dn();

         for (cdz $$8 : $$0.dN().a(cdz.class, new eju($$6).c(2.0, 2.0, 2.0))) {
            if ($$8.fE()) {
               $$1.a(0.15F * $$5, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
