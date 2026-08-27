public class fyo extends fxd<bxs, fjx<bxs>> {
   private static final agi a = new agi("textures/entity/turtle/big_sea_turtle.png");

   public fyo(fvx.a $$0) {
      super($$0, new fjx<>($$0.a(fkn.bH)), 0.7F);
   }

   public void a(bxs $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      if ($$0.n_()) {
         this.d *= 0.5F;
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agi a(bxs $$0) {
      return a;
   }
}
