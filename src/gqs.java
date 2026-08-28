public class gqs<T extends chq> extends gnf<T, gwl, gan> {
   private static final ali a = ali.b("textures/entity/squid/squid.png");

   public gqs(gok.a $$0, gan $$1, gan $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public ali a(gwl $$0) {
      return a;
   }

   public gwl c() {
      return new gwl();
   }

   public void a(T $$0, gwl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azk.h($$2, $$0.cf, $$0.ce);
      $$1.b = azk.h($$2, $$0.bZ, $$0.bY);
      $$1.c = azk.h($$2, $$0.cb, $$0.ca);
   }

   protected void a(gwl $$0, feb $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.ae ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.ae ? -0.6F : -1.2F, 0.0F);
   }
}
