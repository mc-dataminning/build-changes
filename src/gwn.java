public class gwn<T extends cnu> extends gvl<T, hbk, ggc> {
   private static final ald a = ald.b("textures/entity/spider/spider.png");

   public gwn(guf.a $$0) {
      this($$0, ghc.dg);
   }

   public gwn(guf.a $$0, ghb $$1) {
      super($$0, new ggc($$0.a($$1)), 0.8F);
      this.a(new gyz<>(this));
   }

   @Override
   protected float aR_() {
      return 180.0F;
   }

   @Override
   public ald b(hbk $$0) {
      return a;
   }

   public hbk b() {
      return new hbk();
   }

   public void a(T $$0, hbk $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
