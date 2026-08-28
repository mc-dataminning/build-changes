public class gmi extends gkf<ckf> {
   private static final akk a = new akk("textures/entity/illager/vindicator.png");

   public gmi(gjm.a $$0) {
      super($$0, new fvc<>($$0.a(fxn.bQ)), 0.5F);
      this.a(new gnr<ckf, fvc<ckf>>(this, $$0.d()) {
         public void a(fam $$0, ged $$1, int $$2, ckf $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gf()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public akk a(ckf $$0) {
      return a;
   }
}
