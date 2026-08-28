public class gwy extends gsz<cjk, hcr, ggk> {
   private static final ald a = ald.b("textures/entity/turtle/big_sea_turtle.png");

   public gwy(guf.a $$0) {
      super($$0, new ggk($$0.a(ghc.dC)), new ggk($$0.a(ghc.dD)), 0.7F);
   }

   protected float a(hcr $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public hcr b() {
      return new hcr();
   }

   public void a(cjk $$0, hcr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.n_() && $$0.q();
   }

   public ald b(hcr $$0) {
      return a;
   }
}
