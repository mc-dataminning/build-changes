public class gfx extends gee<cgo, fqs<cgo>> {
   private static final ajh a = new ajh("textures/entity/witch.png");

   public gfx(gcy.a $$0) {
      super($$0, new fqs<>($$0.a(frc.bQ)), 0.5F);
      this.a(new ghw<>(this, $$0.d()));
   }

   public void a(cgo $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      this.f.b(!$$0.eU().b());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajh a(cgo $$0) {
      return a;
   }

   protected void a(cgo $$0, etz $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }
}
