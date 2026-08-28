public class gmk extends gkh<ckg> {
   private static final akk a = new akk("textures/entity/illager/vindicator.png");

   public gmk(gjo.a $$0) {
      super($$0, new fve<>($$0.a(fxp.bQ)), 0.5F);
      this.a(new gnt<ckg, fve<ckg>>(this, $$0.d()) {
         public void a(fao $$0, gef $$1, int $$2, ckg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.ge()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public akk a(ckg $$0) {
      return a;
   }
}
