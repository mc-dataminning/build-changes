public class gdj extends gee<cft, fop<cft>> {
   private static final ajh a = new ajh("textures/entity/zombie/zombie.png");
   private final float i;

   public gdj(gcy.a $$0, float $$1) {
      super($$0, new foh($$0.a(frc.ad)), 0.5F * $$1);
      this.i = $$1;
      this.a(new ghc<>(this, $$0.d()));
      this.a(new ggz<>(this, new foh($$0.a(frc.ae)), new foh($$0.a(frc.af)), $$0.g()));
   }

   protected void a(cft $$0, etz $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public ajh a(cft $$0) {
      return a;
   }
}
