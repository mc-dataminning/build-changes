public class hbd extends gxe<ckt, hgy, gkm> {
   private static final alk a = alk.b("textures/entity/turtle/big_sea_turtle.png");

   public hbd(gyk.a $$0) {
      super($$0, new gkm($$0.a(glf.dI)), new gkm($$0.a(glf.dJ)), 0.7F);
   }

   protected float a(hgy $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public hgy b() {
      return new hgy();
   }

   public void a(ckt $$0, hgy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bi() && $$0.aH();
      $$1.b = $$0.t();
      $$1.c = !$$0.n_() && $$0.q();
   }

   public alk b(hgy $$0) {
      return a;
   }
}
