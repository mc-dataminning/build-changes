public class gpr<T extends cgz> extends gme<T, gvj, fzm> {
   private static final alc a = alc.b("textures/entity/squid/squid.png");

   public gpr(gnj.a $$0, fzm $$1, fzm $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alc a(gvj $$0) {
      return a;
   }

   public gvj c() {
      return new gvj();
   }

   public void a(T $$0, gvj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azd.h($$2, $$0.cf, $$0.ce);
      $$1.b = azd.h($$2, $$0.bZ, $$0.bY);
      $$1.c = azd.h($$2, $$0.cb, $$0.ca);
   }

   protected void a(gvj $$0, fde $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.ae ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.ae ? -0.6F : -1.2F, 0.0F);
   }
}
