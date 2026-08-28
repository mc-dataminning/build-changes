public class glp extends gkb<ckp, fwh> {
   private static final ale a = new ale("textures/entity/illager/vex.png");
   private static final ale i = new ale("textures/entity/illager/vex_charging.png");

   public glp(giv.a $$0) {
      super($$0, new fwh($$0.a(fwx.bO)), 0.3F);
      this.a(new gna<>(this, $$0.d()));
   }

   protected int a(ckp $$0, iz $$1) {
      return 15;
   }

   public ale a(ckp $$0) {
      return $$0.gr() ? i : a;
   }
}
