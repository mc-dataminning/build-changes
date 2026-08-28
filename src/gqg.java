public class gqg extends gmj<che, gvw, fzx> {
   private static final ale a = ale.b("textures/entity/turtle/big_sea_turtle.png");

   public gqg(gno.a $$0) {
      super($$0, new fzx($$0.a(gap.cQ)), new fzx($$0.a(gap.cR)), 0.7F);
   }

   protected float a(gvw $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.83F : $$1;
   }

   public gvw c() {
      return new gvw();
   }

   public void a(che $$0, gvw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bi() && $$0.aH();
      $$1.b = $$0.t();
      $$1.c = !$$0.p_() && $$0.q();
   }

   public ale b(gvw $$0) {
      return a;
   }
}
