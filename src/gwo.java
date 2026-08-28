public class gwo<T extends cjh> extends gsz<T, hcj, gge> {
   private static final ald a = ald.b("textures/entity/squid/squid.png");

   public gwo(guf.a $$0, gge $$1, gge $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public ald a(hcj $$0) {
      return a;
   }

   public hcj b() {
      return new hcj();
   }

   public void a(T $$0, hcj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azk.h($$2, $$0.bL, $$0.bK);
      $$1.b = azk.h($$2, $$0.bF, $$0.bE);
      $$1.c = azk.h($$2, $$0.bH, $$0.bG);
   }

   protected void a(hcj $$0, fho $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.aj ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.aj ? -0.6F : -1.2F, 0.0F);
   }
}
