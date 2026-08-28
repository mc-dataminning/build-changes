public class fyx extends fyl<cvj> {
   private static final alg G = alg.b("textures/gui/container/crafting_table.png");

   public fyx(cvj $$0, cqx $$1, wy $$2) {
      super($$0, new gbp($$0), $$1, $$2);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.v = 29;
   }

   @Override
   protected fwi G() {
      return new fwi(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(fro $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gqc::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
