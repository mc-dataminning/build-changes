public class gux extends gqy<chz, has, gek> {
   private static final akv a = akv.b("textures/entity/turtle/big_sea_turtle.png");

   public gux(gse.a $$0) {
      super($$0, new gek($$0.a(gfc.dq)), new gek($$0.a(gfc.dr)), 0.7F);
   }

   protected float a(has $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public has b() {
      return new has();
   }

   public void a(chz $$0, has $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.e_() && $$0.p();
   }

   public akv b(has $$0) {
      return a;
   }
}
