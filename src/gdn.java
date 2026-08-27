public class gdn extends gbl<cfc> {
   private static final aiy a = new aiy("textures/entity/illager/vindicator.png");

   public gdn(gas.a $$0) {
      super($$0, new fmp<>($$0.a(fpb.bM)), 0.5F);
      this.a(new gew<cfc, fmp<cfc>>(this, $$0.d()) {
         public void a(esa $$0, fvl $$1, int $$2, cfc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.fY()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public aiy a(cfc $$0) {
      return a;
   }
}
