public class gjw extends gku<cfc, fus<cfc>> {
   private static final akk a = new akk("textures/entity/fox/fox.png");
   private static final akk i = new akk("textures/entity/fox/fox_sleep.png");
   private static final akk j = new akk("textures/entity/fox/snow_fox.png");
   private static final akk k = new akk("textures/entity/fox/snow_fox_sleep.png");

   public gjw(gjo.a $$0) {
      super($$0, new fus<>($$0.a(fxp.ad)), 0.4F);
      this.a(new gnn(this, $$0.d()));
   }

   protected void a(cfc $$0, fao $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gt() || $$0.gn()) {
         float $$6 = -ayg.i($$4, $$0.P, $$0.dJ());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public akk a(cfc $$0) {
      if ($$0.t() == cfc.v.a) {
         return $$0.fJ() ? i : a;
      } else {
         return $$0.fJ() ? k : j;
      }
   }
}
