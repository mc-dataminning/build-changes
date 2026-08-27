public class ful extends fvj<bwe, ffz<bwe>> {
   private static final afw a = new afw("textures/entity/fox/fox.png");
   private static final afw i = new afw("textures/entity/fox/fox_sleep.png");
   private static final afw j = new afw("textures/entity/fox/snow_fox.png");
   private static final afw k = new afw("textures/entity/fox/snow_fox_sleep.png");

   public ful(fud.a $$0) {
      super($$0, new ffz<>($$0.a(fiv.X)), 0.4F);
      this.a(new fxy(this, $$0.d()));
   }

   protected void a(bwe $$0, emh $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gk() || $$0.ge()) {
         float $$5 = -asy.i($$4, $$0.O, $$0.dD());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public afw a(bwe $$0) {
      if ($$0.t() == bwe.v.a) {
         return $$0.fD() ? i : a;
      } else {
         return $$0.fD() ? k : j;
      }
   }
}
