public class guv extends gqw<chy, haq, gej> {
   private static final aku a = aku.b("textures/entity/turtle/big_sea_turtle.png");

   public guv(gsc.a $$0) {
      super($$0, new gej($$0.a(gfb.dq)), new gej($$0.a(gfb.dr)), 0.7F);
   }

   protected float a(haq $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public haq b() {
      return new haq();
   }

   public void a(chy $$0, haq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.e_() && $$0.p();
   }

   public aku b(haq $$0) {
      return a;
   }
}
