public class gqg<T extends clx> extends gpf<T, gva, gaa> {
   private static final alh a = alh.b("textures/entity/spider/spider.png");

   public gqg(gnz.a $$0) {
      this($$0, gba.cy);
   }

   public gqg(gnz.a $$0, gaz $$1) {
      super($$0, new gaa($$0.a($$1)), 0.8F);
      this.a(new gss<>(this));
   }

   @Override
   protected float aW_() {
      return 180.0F;
   }

   @Override
   public alh b(gva $$0) {
      return a;
   }

   public gva c() {
      return new gva();
   }

   public void a(T $$0, gva $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
