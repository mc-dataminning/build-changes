public class glm extends gjy<ckm, fwe> {
   private static final alb a = new alb("textures/entity/illager/vex.png");
   private static final alb i = new alb("textures/entity/illager/vex_charging.png");

   public glm(gis.a $$0) {
      super($$0, new fwe($$0.a(fwu.bO)), 0.3F);
      this.a(new gmx<>(this, $$0.d()));
   }

   protected int a(ckm $$0, iz $$1) {
      return 15;
   }

   public alb a(ckm $$0) {
      return $$0.gr() ? i : a;
   }
}
