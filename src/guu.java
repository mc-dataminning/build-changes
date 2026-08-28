public class guu extends gqv<chx, hap, geh> {
   private static final aku a = aku.b("textures/entity/turtle/big_sea_turtle.png");

   public guu(gsb.a $$0) {
      super($$0, new geh($$0.a(gez.dq)), new geh($$0.a(gez.dr)), 0.7F);
   }

   protected float a(hap $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public hap b() {
      return new hap();
   }

   public void a(chx $$0, hap $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.e_() && $$0.p();
   }

   public aku b(hap $$0) {
      return a;
   }
}
