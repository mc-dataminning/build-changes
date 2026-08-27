public class gfs extends gee<cif, fqo<cif>> {
   private static final ajh a = new ajh("textures/entity/villager/villager.png");

   public gfs(gcy.a $$0) {
      super($$0, new fqo<>($$0.a(frc.bL)), 0.5F);
      this.a(new ggo<>(this, $$0.f(), $$0.d()));
      this.a(new ghu<>(this, $$0.e(), "villager"));
      this.a(new ggn<>(this, $$0.d()));
   }

   public ajh a(cif $$0) {
      return a;
   }

   protected void a(cif $$0, etz $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ea();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cif $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }
}
