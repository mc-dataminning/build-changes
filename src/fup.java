public class fup extends fui<bzf, ffz<bzf>> {
   private static final aeu a = new aeu("textures/entity/phantom.png");

   public fup(ftc.a $$0) {
      super($$0, new ffz<>($$0.a(fhw.aB)), 0.75F);
      this.a(new fxi<>(this));
   }

   public aeu a(bzf $$0) {
      return a;
   }

   protected void a(bzf $$0, elk $$1, float $$2) {
      int $$3 = $$0.p();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(bzf $$0, elk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a(a.b.rotationDegrees($$0.dC()));
   }
}
