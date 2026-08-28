public class guk<T extends cmi> extends gti<T, gzi, geb> {
   private static final aku a = aku.b("textures/entity/spider/spider.png");

   public guk(gsc.a $$0) {
      this($$0, gfb.cU);
   }

   public guk(gsc.a $$0, gfa $$1) {
      super($$0, new geb($$0.a($$1)), 0.8F);
      this.a(new gwx<>(this));
   }

   @Override
   protected float aU_() {
      return 180.0F;
   }

   @Override
   public aku b(gzi $$0) {
      return a;
   }

   public gzi b() {
      return new gzi();
   }

   public void a(T $$0, gzi $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
