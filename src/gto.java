public class gto extends gsz<cil, hab, gdn> {
   private static final ald a = ald.b("textures/entity/chicken.png");

   public gto(guf.a $$0) {
      super($$0, new gdn($$0.a(ghc.Z)), new gdn($$0.a(ghc.aa)), 0.3F);
   }

   public ald a(hab $$0) {
      return a;
   }

   public hab a() {
      return new hab();
   }

   public void a(cil $$0, hab $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azk.h($$2, $$0.bI, $$0.bE);
      $$1.b = azk.h($$2, $$0.bG, $$0.bF);
   }
}
