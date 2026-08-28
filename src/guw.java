public class guw extends gqx<chy, har, gej> {
   private static final akv a = akv.b("textures/entity/turtle/big_sea_turtle.png");

   public guw(gsd.a $$0) {
      super($$0, new gej($$0.a(gfb.dq)), new gej($$0.a(gfb.dr)), 0.7F);
   }

   protected float a(har $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public har b() {
      return new har();
   }

   public void a(chy $$0, har $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.e_() && $$0.p();
   }

   public akv b(har $$0) {
      return a;
   }
}
