public class gyu extends har<bxj> {
   private static final ali a = ali.b("textures/entity/squid/glow_squid.png");

   public gyu(gyi.a $$0, gke $$1, gke $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public ali a(hgo $$0) {
      return a;
   }

   protected int a(bxj $$0, iv $$1) {
      int $$2 = (int)azo.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
