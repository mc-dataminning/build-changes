public class hao extends gwp<clc, hgm, gjx> {
   private static final alr a = alr.b("textures/entity/turtle/big_sea_turtle.png");

   public hao(gxv.a $$0) {
      super($$0, new gjx($$0.a(gkq.dI)), new gjx($$0.a(gkq.dJ)), 0.7F);
   }

   protected float a(hgm $$0) {
      float $$1 = super.g($$0);
      return $$0.am ? $$1 * 0.83F : $$1;
   }

   public hgm b() {
      return new hgm();
   }

   public void a(clc $$0, hgm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bi() && $$0.aH();
      $$1.b = $$0.t();
      $$1.c = !$$0.n_() && $$0.q();
   }

   public alr b(hgm $$0) {
      return a;
   }
}
