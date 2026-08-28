public class guk<T extends chv> extends gqv<T, hah, geb> {
   private static final aku a = aku.b("textures/entity/squid/squid.png");

   public guk(gsb.a $$0, geb $$1, geb $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public aku a(hah $$0) {
      return a;
   }

   public hah b() {
      return new hah();
   }

   public void a(T $$0, hah $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayy.h($$2, $$0.cf, $$0.ce);
      $$1.b = ayy.h($$2, $$0.bZ, $$0.bY);
      $$1.c = ayy.h($$2, $$0.cb, $$0.ca);
   }

   protected void a(hah $$0, ffs $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.aj ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.aj ? -0.6F : -1.2F, 0.0F);
   }
}
