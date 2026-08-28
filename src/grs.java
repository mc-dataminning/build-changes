public class grs<T extends cmj> extends gqq<T, gwm, gbk> {
   private static final alj a = alj.b("textures/entity/spider/spider.png");

   public grs(gpk.a $$0) {
      this($$0, gck.cO);
   }

   public grs(gpk.a $$0, gcj $$1) {
      super($$0, new gbk($$0.a($$1)), 0.8F);
      this.a(new gue<>(this));
   }

   @Override
   protected float aV_() {
      return 180.0F;
   }

   @Override
   public alj b(gwm $$0) {
      return a;
   }

   public gwm b() {
      return new gwm();
   }

   public void a(T $$0, gwm $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
