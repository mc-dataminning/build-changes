public class haq<T extends cpk> extends gzo<T, hfp, gkc> {
   private static final ali a = ali.b("textures/entity/spider/spider.png");

   public haq(gyi.a $$0) {
      this($$0, gld.dm);
   }

   public haq(gyi.a $$0, glc $$1) {
      super($$0, new gkc($$0.a($$1)), 0.8F);
      this.a(new hdd<>(this));
   }

   @Override
   protected float aW_() {
      return 180.0F;
   }

   @Override
   public ali b(hfp $$0) {
      return a;
   }

   public hfp b() {
      return new hfp();
   }

   public void a(T $$0, hfp $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
