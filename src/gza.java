public class gza extends gvb<ckc, heu, gii> {
   private static final alg a = alg.b("textures/entity/turtle/big_sea_turtle.png");

   public gza(gwh.a $$0) {
      super($$0, new gii($$0.a(gjb.dG)), new gii($$0.a(gjb.dH)), 0.7F);
   }

   protected float a(heu $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public heu b() {
      return new heu();
   }

   public void a(ckc $$0, heu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.n_() && $$0.q();
   }

   public alg b(heu $$0) {
      return a;
   }
}
