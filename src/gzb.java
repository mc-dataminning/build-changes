public class gzb<T extends cow> extends gxz<T, hdz, gim> {
   private static final alg a = alg.b("textures/entity/spider/spider.png");

   public gzb(gwt.a $$0) {
      this($$0, gjn.dk);
   }

   public gzb(gwt.a $$0, gjm $$1) {
      super($$0, new gim($$0.a($$1)), 0.8F);
      this.a(new hbn<>(this));
   }

   @Override
   protected float aS_() {
      return 180.0F;
   }

   @Override
   public alg b(hdz $$0) {
      return a;
   }

   public hdz b() {
      return new hdz();
   }

   public void a(T $$0, hdz $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
