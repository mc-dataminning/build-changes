public class gri<T extends chu> extends gnv<T, gxb, gbd> {
   private static final all a = all.b("textures/entity/squid/squid.png");

   public gri(gpa.a $$0, gbd $$1, gbd $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public all a(gxb $$0) {
      return a;
   }

   public gxb c() {
      return new gxb();
   }

   public void a(T $$0, gxb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azn.h($$2, $$0.cf, $$0.ce);
      $$1.b = azn.h($$2, $$0.bZ, $$0.bY);
      $$1.c = azn.h($$2, $$0.cb, $$0.ca);
   }

   protected void a(gxb $$0, fek $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.ae ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.ae ? -0.6F : -1.2F, 0.0F);
   }
}
