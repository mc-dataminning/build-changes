public class fuq extends fuj<bzq, ffz<bzq>> {
   private static final aez a = new aez("textures/entity/phantom.png");

   public fuq(ftd.a $$0) {
      super($$0, new ffz<>($$0.a(fhw.aB)), 0.75F);
      this.a(new fxj<>(this));
   }

   public aez a(bzq $$0) {
      return a;
   }

   protected void a(bzq $$0, elj $$1, float $$2) {
      int $$3 = $$0.s();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(bzq $$0, elj $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a(a.b.rotationDegrees($$0.dD()));
   }
}
