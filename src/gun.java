public class gun<T extends cmk> extends gtl<T, gzl, ged> {
   private static final akv a = akv.b("textures/entity/spider/spider.png");

   public gun(gsf.a $$0) {
      this($$0, gfd.cU);
   }

   public gun(gsf.a $$0, gfc $$1) {
      super($$0, new ged($$0.a($$1)), 0.8F);
      this.a(new gxa<>(this));
   }

   @Override
   protected float aV_() {
      return 180.0F;
   }

   @Override
   public akv b(gzl $$0) {
      return a;
   }

   public gzl b() {
      return new gzl();
   }

   public void a(T $$0, gzl $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
