public class gic extends ggo<cjg, fsx<cjg>> {
   private static final ajt a = new ajt("textures/entity/villager/villager.png");

   public gic(gfi.a $$0) {
      super($$0, new fsx<>($$0.a(ftl.bP)), 0.5F);
      this.a(new giy<>(this, $$0.f(), $$0.d()));
      this.a(new gke<>(this, $$0.e(), "villager"));
      this.a(new gix<>(this, $$0.d()));
   }

   public ajt a(cjg $$0) {
      return a;
   }

   protected void a(cjg $$0, ewi $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ea();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cjg $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }
}
