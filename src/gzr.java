public class gzr extends gvs<ckg, hfm, giz> {
   private static final alg a = alg.b("textures/entity/turtle/big_sea_turtle.png");

   public gzr(gwy.a $$0) {
      super($$0, new giz($$0.a(gjs.dI)), new giz($$0.a(gjs.dJ)), 0.7F);
   }

   protected float a(hfm $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public hfm b() {
      return new hfm();
   }

   public void a(ckg $$0, hfm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bh() && $$0.aH();
      $$1.b = $$0.t();
      $$1.c = !$$0.n_() && $$0.q();
   }

   public alg b(hfm $$0) {
      return a;
   }
}
