public class fvl extends fuz<cst> {
   private static final aku G = aku.b("textures/gui/container/crafting_table.png");

   public fvl(cst $$0, cou $$1, wo $$2) {
      super($$0, new fyb($$0), $$1, $$2);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.v = 29;
   }

   @Override
   protected fsw G() {
      return new fsw(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(fob $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gmf::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
