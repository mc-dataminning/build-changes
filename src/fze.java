public class fze extends fys<cvo> {
   private static final alg G = alg.b("textures/gui/container/crafting_table.png");

   public fze(cvo $$0, crb $$1, wy $$2) {
      super($$0, new gbw($$0), $$1, $$2);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.v = 29;
   }

   @Override
   protected fwp G() {
      return new fwp(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(frv $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gqk::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
