public class gtr<T extends cnd> extends gsp<T, gym, gdg> {
   private static final alz a = alz.b("textures/entity/spider/spider.png");

   public gtr(grj.a $$0) {
      this($$0, geg.cR);
   }

   public gtr(grj.a $$0, gef $$1) {
      super($$0, new gdg($$0.a($$1)), 0.8F);
      this.a(new gwe<>(this));
   }

   @Override
   protected float aX_() {
      return 180.0F;
   }

   @Override
   public alz b(gym $$0) {
      return a;
   }

   public gym b() {
      return new gym();
   }

   public void a(T $$0, gym $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
