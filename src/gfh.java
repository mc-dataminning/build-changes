public class gfh extends gee<cgl, fqg<cgl>> {
   private static final ajh a = new ajh("textures/entity/strider/strider.png");
   private static final ajh i = new ajh("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gfh(gcy.a $$0) {
      super($$0, new fqg<>($$0.a(frc.bz)), 0.5F);
      this.a(new ghk<>(this, new fqg<>($$0.a(frc.bA)), new ajh("textures/entity/strider/strider_saddle.png")));
   }

   public ajh a(cgl $$0) {
      return $$0.r() ? i : a;
   }

   protected float b(cgl $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cgl $$0, etz $$1, float $$2) {
      float $$3 = $$0.ea();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cgl $$0) {
      return super.a($$0) || $$0.r();
   }
}
