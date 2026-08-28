public class har<T extends cko> extends gxc<T, hgo, gke> {
   private static final ali a = ali.b("textures/entity/squid/squid.png");

   public har(gyi.a $$0, gke $$1, gke $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public ali a(hgo $$0) {
      return a;
   }

   public hgo b() {
      return new hgo();
   }

   public void a(T $$0, hgo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azo.h($$2, $$0.bP, $$0.bO);
      $$1.b = azo.h($$2, $$0.bJ, $$0.bI);
      $$1.c = azo.h($$2, $$0.bL, $$0.bK);
   }

   protected void a(hgo $$0, flo $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.aj ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.aj ? -0.6F : -1.2F, 0.0F);
   }
}
