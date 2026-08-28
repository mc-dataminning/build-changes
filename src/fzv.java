public class fzv extends fzj<cvy> {
   private static final alg G = alg.b("textures/gui/container/crafting_table.png");

   public fzv(cvy $$0, crl $$1, wy $$2) {
      super($$0, new gcn($$0), $$1, $$2);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.v = 29;
   }

   @Override
   protected fxg G() {
      return new fxg(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(fsm $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(grc::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
