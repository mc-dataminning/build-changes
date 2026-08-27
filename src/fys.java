public class fys extends fwq<cbx> {
   private static final agi a = new agi("textures/entity/illager/vindicator.png");

   public fys(fvx.a $$0) {
      super($$0, new fid<>($$0.a(fkn.bK)), 0.5F);
      this.a(new fzy<cbx, fid<cbx>>(this, $$0.d()) {
         public void a(enw $$0, fqu $$1, int $$2, cbx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.fX()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public agi a(cbx $$0) {
      return a;
   }
}
