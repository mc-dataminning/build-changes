public class gpw<T extends chc> extends gmj<T, gvo, fzr> {
   private static final ale a = ale.b("textures/entity/squid/squid.png");

   public gpw(gno.a $$0, fzr $$1, fzr $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public ale a(gvo $$0) {
      return a;
   }

   public gvo c() {
      return new gvo();
   }

   public void a(T $$0, gvo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azf.h($$2, $$0.cf, $$0.ce);
      $$1.b = azf.h($$2, $$0.bZ, $$0.bY);
      $$1.c = azf.h($$2, $$0.cb, $$0.ca);
   }

   protected void a(gvo $$0, fdi $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.ae ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.ae ? -0.6F : -1.2F, 0.0F);
   }
}
