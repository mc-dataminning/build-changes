public class gpv<T extends clo> extends gou<T, guo, fzp> {
   private static final ale a = ale.b("textures/entity/spider/spider.png");

   public gpv(gno.a $$0) {
      this($$0, gap.cy);
   }

   public gpv(gno.a $$0, gao $$1) {
      super($$0, new fzp($$0.a($$1)), 0.8F);
      this.a(new gsh<>(this));
   }

   @Override
   protected float aW_() {
      return 180.0F;
   }

   @Override
   public ale b(guo $$0) {
      return a;
   }

   public guo c() {
      return new guo();
   }

   public void a(T $$0, guo $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
