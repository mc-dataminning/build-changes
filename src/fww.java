public class fww extends fvj<caz, fig> {
   private static final afw a = new afw("textures/entity/illager/vex.png");
   private static final afw i = new afw("textures/entity/illager/vex_charging.png");

   public fww(fud.a $$0) {
      super($$0, new fig($$0.a(fiv.bI)), 0.3F);
      this.a(new fye<>(this, $$0.d()));
   }

   protected int a(caz $$0, ht $$1) {
      return 15;
   }

   public afw a(caz $$0) {
      return $$0.ge() ? i : a;
   }
}
