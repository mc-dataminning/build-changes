public class fvf extends fxd<bwu, fha<bwu>> {
   public fvf(fvx.a $$0) {
      super($$0, new fha<>($$0.a(fkn.n)), 0.4F);
      this.a(new fzh(this, $$0.f()));
   }

   public agi a(bwu $$0) {
      return $$0.gl();
   }

   protected void a(bwu $$0, enw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(bwu $$0, enw $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.E($$4);
      if ($$5 > 0.0F) {
         $$1.a(0.4F * $$5, 0.15F * $$5, 0.1F * $$5);
         $$1.a(a.f.rotationDegrees(atm.j($$5, 0.0F, 90.0F)));
         ht $$6 = $$0.dn();

         for (cdu $$8 : $$0.dN().a(cdu.class, new ejp($$6).c(2.0, 2.0, 2.0))) {
            if ($$8.fE()) {
               $$1.a(0.15F * $$5, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
