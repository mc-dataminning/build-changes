public class ful extends fun<bzh, fft<bzh>> {
   private static final aex a = new aex("textures/entity/slime/magmacube.png");

   public ful(fth.a $$0) {
      super($$0, new fft<>($$0.a(fib.au)), 0.25F);
   }

   protected int a(bzh $$0, gw $$1) {
      return 15;
   }

   public aex a(bzh $$0) {
      return a;
   }

   public void a(bzh $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      this.d = 0.25F * (float)$$0.ge();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(bzh $$0, elp $$1, float $$2) {
      int $$3 = $$0.ge();
      float $$4 = arx.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
