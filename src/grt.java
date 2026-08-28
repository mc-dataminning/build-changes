public class grt<T extends chx> extends gof<T, gxm, gbm> {
   private static final alj a = alj.b("textures/entity/squid/squid.png");

   public grt(gpk.a $$0, gbm $$1, gbm $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alj a(gxm $$0) {
      return a;
   }

   public gxm b() {
      return new gxm();
   }

   public void a(T $$0, gxm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.cf, $$0.ce);
      $$1.b = azm.h($$2, $$0.bZ, $$0.bY);
      $$1.c = azm.h($$2, $$0.cb, $$0.ca);
   }

   protected void a(gxm $$0, fer $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.ae ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.ae ? -0.6F : -1.2F, 0.0F);
   }
}
