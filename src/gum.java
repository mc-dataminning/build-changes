public class gum<T extends chw> extends gqx<T, haj, ged> {
   private static final akv a = akv.b("textures/entity/squid/squid.png");

   public gum(gsd.a $$0, ged $$1, ged $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public akv a(haj $$0) {
      return a;
   }

   public haj b() {
      return new haj();
   }

   public void a(T $$0, haj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayz.h($$2, $$0.cf, $$0.ce);
      $$1.b = ayz.h($$2, $$0.bZ, $$0.bY);
      $$1.c = ayz.h($$2, $$0.cb, $$0.ca);
   }

   protected void a(haj $$0, fft $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.aj ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.aj ? -0.6F : -1.2F, 0.0F);
   }
}
