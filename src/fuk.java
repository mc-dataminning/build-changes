public class fuk extends fud<bzc, ffu<bzc>> {
   private static final aer a = new aer("textures/entity/phantom.png");

   public fuk(fsx.a $$0) {
      super($$0, new ffu<>($$0.a(fhr.aB)), 0.75F);
      this.a(new fxd<>(this));
   }

   public aer a(bzc $$0) {
      return a;
   }

   protected void a(bzc $$0, elf $$1, float $$2) {
      int $$3 = $$0.p();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(bzc $$0, elf $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a(a.b.rotationDegrees($$0.dC()));
   }
}
