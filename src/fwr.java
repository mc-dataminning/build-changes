public class fwr extends fwq<cbg> {
   private static final agi a = new agi("textures/entity/illager/illusioner.png");

   public fwr(fvx.a $$0) {
      super($$0, new fid<>($$0.a(fkn.ao)), 0.5F);
      this.a(new fzy<cbg, fid<cbg>>(this, $$0.d()) {
         public void a(enw $$0, fqu $$1, int $$2, cbg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gp() || $$3.fX()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public agi a(cbg $$0) {
      return a;
   }

   public void a(cbg $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      if ($$0.ce()) {
         eju[] $$6 = $$0.E($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)atm.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)atm.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)atm.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(cbg $$0) {
      return true;
   }
}
