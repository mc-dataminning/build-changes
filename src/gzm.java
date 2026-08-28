public class gzm extends gvn<ckg, hfg, giu> {
   private static final alg a = alg.b("textures/entity/turtle/big_sea_turtle.png");

   public gzm(gwt.a $$0) {
      super($$0, new giu($$0.a(gjn.dG)), new giu($$0.a(gjn.dH)), 0.7F);
   }

   protected float a(hfg $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public hfg b() {
      return new hfg();
   }

   public void a(ckg $$0, hfg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bh() && $$0.aH();
      $$1.b = $$0.t();
      $$1.c = !$$0.n_() && $$0.q();
   }

   public alg b(hfg $$0) {
      return a;
   }
}
