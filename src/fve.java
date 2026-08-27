public class fve extends ftc<bzo> {
   private static final aep a = new aep("textures/entity/illager/vindicator.png");

   public fve(fsj.a $$0) {
      super($$0, new fey<>($$0.a(fhi.bK)), 0.5F);
      this.a(new fwk<bzo, fey<bzo>>(this, $$0.d()) {
         public void a(elh $$0, fng $$1, int $$2, bzo $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.fS()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public aep a(bzo $$0) {
      return a;
   }
}
