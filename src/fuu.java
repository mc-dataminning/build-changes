public class fuu extends fun<bzk, fge<bzk>> {
   private static final aew a = new aew("textures/entity/phantom.png");

   public fuu(fth.a $$0) {
      super($$0, new fge<>($$0.a(fib.aB)), 0.75F);
      this.a(new fxn<>(this));
   }

   public aew a(bzk $$0) {
      return a;
   }

   protected void a(bzk $$0, elp $$1, float $$2) {
      int $$3 = $$0.s();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(bzk $$0, elp $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a(a.b.rotationDegrees($$0.dD()));
   }
}
