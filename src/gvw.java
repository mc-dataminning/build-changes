public class gvw extends grx<cit, hbr, gfj> {
   private static final aku a = aku.b("textures/entity/turtle/big_sea_turtle.png");

   public gvw(gtd.a $$0) {
      super($$0, new gfj($$0.a(ggb.ds)), new gfj($$0.a(ggb.dt)), 0.7F);
   }

   protected float a(hbr $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public hbr b() {
      return new hbr();
   }

   public void a(cit $$0, hbr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.n_() && $$0.q();
   }

   public aku b(hbr $$0) {
      return a;
   }
}
