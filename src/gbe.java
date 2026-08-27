public class gbe extends fzr<cdc, fme> {
   private static final ahg a = new ahg("textures/entity/illager/vex.png");
   private static final ahg i = new ahg("textures/entity/illager/vex_charging.png");

   public gbe(fyl.a $$0) {
      super($$0, new fme($$0.a(fmu.bL)), 0.3F);
      this.a(new gcp<>(this, $$0.d()));
   }

   protected int a(cdc $$0, hx $$1) {
      return 15;
   }

   public ahg a(cdc $$0) {
      return $$0.gf() ? i : a;
   }
}
