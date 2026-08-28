public class gyq<T extends cjz> extends gvb<T, hem, gic> {
   private static final alg a = alg.b("textures/entity/squid/squid.png");

   public gyq(gwh.a $$0, gic $$1, gic $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alg a(hem $$0) {
      return a;
   }

   public hem b() {
      return new hem();
   }

   public void a(T $$0, hem $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bN, $$0.bM);
      $$1.b = azm.h($$2, $$0.bH, $$0.bG);
      $$1.c = azm.h($$2, $$0.bJ, $$0.bI);
   }

   protected void a(hem $$0, fjj $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.aj ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.aj ? -0.6F : -1.2F, 0.0F);
   }
}
