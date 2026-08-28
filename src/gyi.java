public class gyi<T extends cjv> extends gut<T, hee, ghu> {
   private static final alg a = alg.b("textures/entity/squid/squid.png");

   public gyi(gvz.a $$0, ghu $$1, ghu $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alg a(hee $$0) {
      return a;
   }

   public hee b() {
      return new hee();
   }

   public void a(T $$0, hee $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bM, $$0.bL);
      $$1.b = azm.h($$2, $$0.bG, $$0.bF);
      $$1.c = azm.h($$2, $$0.bI, $$0.bH);
   }

   protected void a(hee $$0, fjc $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.aj ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.aj ? -0.6F : -1.2F, 0.0F);
   }
}
