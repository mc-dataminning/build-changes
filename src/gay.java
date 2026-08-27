public class gay extends fzl<ccx, fly> {
   private static final ahd a = new ahd("textures/entity/illager/vex.png");
   private static final ahd i = new ahd("textures/entity/illager/vex_charging.png");

   public gay(fyf.a $$0) {
      super($$0, new fly($$0.a(fmo.bL)), 0.3F);
      this.a(new gcj<>(this, $$0.d()));
   }

   protected int a(ccx $$0, hx $$1) {
      return 15;
   }

   public ahd a(ccx $$0) {
      return $$0.gf() ? i : a;
   }
}
