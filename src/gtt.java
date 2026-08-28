public class gtt<T extends cmz> extends gsr<T, gyo, gdi> {
   private static final alp a = alp.b("textures/entity/spider/spider.png");

   public gtt(grl.a $$0) {
      this($$0, gei.cU);
   }

   public gtt(grl.a $$0, geh $$1) {
      super($$0, new gdi($$0.a($$1)), 0.8F);
      this.a(new gwg<>(this));
   }

   @Override
   protected float aW_() {
      return 180.0F;
   }

   @Override
   public alp b(gyo $$0) {
      return a;
   }

   public gyo b() {
      return new gyo();
   }

   public void a(T $$0, gyo $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
