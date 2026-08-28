public class hbb extends gxc<ckr, hgw, gkk> {
   private static final ali a = ali.b("textures/entity/turtle/big_sea_turtle.png");

   public hbb(gyi.a $$0) {
      super($$0, new gkk($$0.a(gld.dI)), new gkk($$0.a(gld.dJ)), 0.7F);
   }

   protected float a(hgw $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public hgw b() {
      return new hgw();
   }

   public void a(ckr $$0, hgw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bi() && $$0.aH();
      $$1.b = $$0.t();
      $$1.c = !$$0.n_() && $$0.q();
   }

   public ali b(hgw $$0) {
      return a;
   }
}
