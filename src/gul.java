public class gul<T extends cmi> extends gtj<T, gzj, geb> {
   private static final akv a = akv.b("textures/entity/spider/spider.png");

   public gul(gsd.a $$0) {
      this($$0, gfb.cU);
   }

   public gul(gsd.a $$0, gfa $$1) {
      super($$0, new geb($$0.a($$1)), 0.8F);
      this.a(new gwy<>(this));
   }

   @Override
   protected float aV_() {
      return 180.0F;
   }

   @Override
   public akv b(gzj $$0) {
      return a;
   }

   public gzj b() {
      return new gzj();
   }

   public void a(T $$0, gzj $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
