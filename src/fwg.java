public class fwg extends fup<cba, fhr<cba>> {
   private static final aey a = new aey("textures/entity/warden/warden.png");
   private static final aey i = new aey("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final aey j = new aey("textures/entity/warden/warden_heart.png");
   private static final aey k = new aey("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final aey l = new aey("textures/entity/warden/warden_pulsating_spots_2.png");

   public fwg(ftj.a $$0) {
      super($$0, new fhr<>($$0.a(fid.bL)), 0.9F);
      this.a(new fyd<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fhr::e));
      this.a(new fyd<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, ary.b($$2 * 0.045F) * 0.25F), fhr::f));
      this.a(new fyd<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, ary.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fhr::f));
      this.a(new fyd<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fhr::c));
      this.a(new fyd<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fhr::d));
   }

   public aey a(cba $$0) {
      return a;
   }
}
