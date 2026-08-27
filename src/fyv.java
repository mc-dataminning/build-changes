public class fyv extends fxi<ccb, fkd> {
   private static final agm a = new agm("textures/entity/illager/vex.png");
   private static final agm i = new agm("textures/entity/illager/vex_charging.png");

   public fyv(fwc.a $$0) {
      super($$0, new fkd($$0.a(fks.bI)), 0.3F);
      this.a(new gad<>(this, $$0.d()));
   }

   protected int a(ccb $$0, hx $$1) {
      return 15;
   }

   public agm a(ccb $$0) {
      return $$0.gg() ? i : a;
   }
}
