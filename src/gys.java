public class gys extends gut<cjy, hem, gia> {
   private static final alg a = alg.b("textures/entity/turtle/big_sea_turtle.png");

   public gys(gvz.a $$0) {
      super($$0, new gia($$0.a(git.dE)), new gia($$0.a(git.dF)), 0.7F);
   }

   protected float a(hem $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public hem b() {
      return new hem();
   }

   public void a(cjy $$0, hem $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.n_() && $$0.q();
   }

   public alg b(hem $$0) {
      return a;
   }
}
