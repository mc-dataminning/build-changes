public class gfr extends gee<cgm, fqm> {
   private static final ajh a = new ajh("textures/entity/illager/vex.png");
   private static final ajh i = new ajh("textures/entity/illager/vex_charging.png");

   public gfr(gcy.a $$0) {
      super($$0, new fqm($$0.a(frc.bK)), 0.3F);
      this.a(new ghc<>(this, $$0.d()));
   }

   protected int a(cgm $$0, ib $$1) {
      return 15;
   }

   public ajh a(cgm $$0) {
      return $$0.gn() ? i : a;
   }
}
