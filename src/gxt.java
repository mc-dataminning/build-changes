public class gxt<T extends cjp> extends gue<T, hdo, ghh> {
   private static final ale a = ale.b("textures/entity/squid/squid.png");

   public gxt(gvk.a $$0, ghh $$1, ghh $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public ale a(hdo $$0) {
      return a;
   }

   public hdo b() {
      return new hdo();
   }

   public void a(T $$0, hdo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azk.h($$2, $$0.bM, $$0.bL);
      $$1.b = azk.h($$2, $$0.bG, $$0.bF);
      $$1.c = azk.h($$2, $$0.bI, $$0.bH);
   }

   protected void a(hdo $$0, fiq $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.aj ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.aj ? -0.6F : -1.2F, 0.0F);
   }
}
