public class gqh<T extends chl> extends gmu<T, gwa, gac> {
   private static final alh a = alh.b("textures/entity/squid/squid.png");

   public gqh(gnz.a $$0, gac $$1, gac $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alh a(gwa $$0) {
      return a;
   }

   public gwa c() {
      return new gwa();
   }

   public void a(T $$0, gwa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azj.h($$2, $$0.cf, $$0.ce);
      $$1.b = azj.h($$2, $$0.bZ, $$0.bY);
      $$1.c = azj.h($$2, $$0.cb, $$0.ca);
   }

   protected void a(gwa $$0, fdt $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.ae ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.ae ? -0.6F : -1.2F, 0.0F);
   }
}
