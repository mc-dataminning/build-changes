public class gbg extends gau<cwj> {
   private static final ali G = ali.b("textures/gui/container/crafting_table.png");

   public gbg(cwj $$0, crw $$1, xa $$2) {
      super($$0, new gdy($$0), $$1, $$2);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.v = 29;
   }

   @Override
   protected fyr G() {
      return new fyr(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(ftx $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gsl::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
