public class gun<T extends chx> extends gqy<T, hak, gee> {
   private static final akv a = akv.b("textures/entity/squid/squid.png");

   public gun(gse.a $$0, gee $$1, gee $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public akv a(hak $$0) {
      return a;
   }

   public hak b() {
      return new hak();
   }

   public void a(T $$0, hak $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayz.h($$2, $$0.cf, $$0.ce);
      $$1.b = ayz.h($$2, $$0.bZ, $$0.bY);
      $$1.c = ayz.h($$2, $$0.cb, $$0.ca);
   }

   protected void a(hak $$0, ffu $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.aj ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.aj ? -0.6F : -1.2F, 0.0F);
   }
}
