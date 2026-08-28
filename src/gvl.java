public class gvl<T extends cnd> extends guj<T, haj, gfb> {
   private static final aku a = aku.b("textures/entity/spider/spider.png");

   public gvl(gtd.a $$0) {
      this($$0, ggb.cW);
   }

   public gvl(gtd.a $$0, gga $$1) {
      super($$0, new gfb($$0.a($$1)), 0.8F);
      this.a(new gxy<>(this));
   }

   @Override
   protected float aV_() {
      return 180.0F;
   }

   @Override
   public aku b(haj $$0) {
      return a;
   }

   public haj b() {
      return new haj();
   }

   public void a(T $$0, haj $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
