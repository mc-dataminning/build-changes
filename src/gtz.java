public class gtz<T extends ciw> extends gqk<T, gzt, gdp> {
   private static final alz a = alz.b("textures/entity/squid/squid.png");

   public gtz(grq.a $$0, gdp $$1, gdp $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alz a(gzt $$0) {
      return a;
   }

   public gzt b() {
      return new gzt();
   }

   public void a(T $$0, gzt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bae.h($$2, $$0.cg, $$0.cf);
      $$1.b = bae.h($$2, $$0.ca, $$0.bZ);
      $$1.c = bae.h($$2, $$0.cc, $$0.cb);
   }

   protected void a(gzt $$0, fgs $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.ae ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.ae ? -0.6F : -1.2F, 0.0F);
   }
}
