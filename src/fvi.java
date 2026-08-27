public class fvi extends fxd<bww, fhe<bww>> {
   private static final agi a = new agi("textures/entity/chicken.png");

   public fvi(fvx.a $$0) {
      super($$0, new fhe<>($$0.a(fkn.t)), 0.3F);
   }

   public agi a(bww $$0) {
      return a;
   }

   protected float a(bww $$0, float $$1) {
      float $$2 = atm.i($$1, $$0.bX, $$0.bT);
      float $$3 = atm.i($$1, $$0.bW, $$0.bU);
      return (atm.a($$2) + 1.0F) * $$3;
   }
}
