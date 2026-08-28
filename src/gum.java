public class gum<T extends cmj> extends gtk<T, gzk, gec> {
   private static final akv a = akv.b("textures/entity/spider/spider.png");

   public gum(gse.a $$0) {
      this($$0, gfc.cU);
   }

   public gum(gse.a $$0, gfb $$1) {
      super($$0, new gec($$0.a($$1)), 0.8F);
      this.a(new gwz<>(this));
   }

   @Override
   protected float aV_() {
      return 180.0F;
   }

   @Override
   public akv b(gzk $$0) {
      return a;
   }

   public gzk b() {
      return new gzk();
   }

   public void a(T $$0, gzk $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
