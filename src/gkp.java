public class gkp extends gim<cjt> {
   private static final akn a = new akn("textures/entity/illager/vindicator.png");

   public gkp(ght.a $$0) {
      super($$0, new ftk<>($$0.a(fvv.bQ)), 0.5F);
      this.a(new gly<cjt, ftk<cjt>>(this, $$0.d()) {
         public void a(eyu $$0, gck $$1, int $$2, cjt $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gh()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public akn a(cjt $$0) {
      return a;
   }
}
