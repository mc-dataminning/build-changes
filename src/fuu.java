public class fuu extends fui<ctm> {
   private static final alp G = alp.b("textures/gui/container/crafting_table.png");

   public fuu(ctm $$0, cpn $$1, xk $$2) {
      super($$0, new fxk($$0), $$1, $$2);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.v = 29;
   }

   @Override
   protected fsf G() {
      return new fsf(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(fnl $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(glq::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
