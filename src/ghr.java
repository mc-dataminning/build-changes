public class ghr extends ggo<chm, fsp<chm>> {
   private static final ajt a = new ajt("textures/entity/strider/strider.png");
   private static final ajt i = new ajt("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public ghr(gfi.a $$0) {
      super($$0, new fsp<>($$0.a(ftl.bD)), 0.5F);
      this.a(new gju<>(this, new fsp<>($$0.a(ftl.bE)), new ajt("textures/entity/strider/strider_saddle.png")));
   }

   public ajt a(chm $$0) {
      return $$0.r() ? i : a;
   }

   protected float b(chm $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(chm $$0, ewi $$1, float $$2) {
      float $$3 = $$0.ea();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(chm $$0) {
      return super.a($$0) || $$0.r();
   }
}
