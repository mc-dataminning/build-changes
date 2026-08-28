public class gtx<T extends cnh> extends gsv<T, gys, gdm> {
   private static final alz a = alz.b("textures/entity/spider/spider.png");

   public gtx(grp.a $$0) {
      this($$0, gem.cR);
   }

   public gtx(grp.a $$0, gel $$1) {
      super($$0, new gdm($$0.a($$1)), 0.8F);
      this.a(new gwk<>(this));
   }

   @Override
   protected float aX_() {
      return 180.0F;
   }

   @Override
   public alz b(gys $$0) {
      return a;
   }

   public gys b() {
      return new gys();
   }

   public void a(T $$0, gys $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
