public class gsd extends gof<chz, gxu, gbs> {
   private static final alj a = alj.b("textures/entity/turtle/big_sea_turtle.png");

   public gsd(gpk.a $$0) {
      super($$0, new gbs($$0.a(gck.di)), new gbs($$0.a(gck.dj)), 0.7F);
   }

   protected float a(gxu $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.83F : $$1;
   }

   public gxu b() {
      return new gxu();
   }

   public void a(chz $$0, gxu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.q();
      $$1.c = !$$0.e_() && $$0.n();
   }

   public alj b(gxu $$0) {
      return a;
   }
}
