public class gty<T extends cni> extends gsw<T, gyt, gdn> {
   private static final alz a = alz.b("textures/entity/spider/spider.png");

   public gty(grq.a $$0) {
      this($$0, gen.cR);
   }

   public gty(grq.a $$0, gem $$1) {
      super($$0, new gdn($$0.a($$1)), 0.8F);
      this.a(new gwl<>(this));
   }

   @Override
   protected float aX_() {
      return 180.0F;
   }

   @Override
   public alz b(gyt $$0) {
      return a;
   }

   public gyt b() {
      return new gyt();
   }

   public void a(T $$0, gyt $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
