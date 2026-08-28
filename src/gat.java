public class gat extends gah<cwu> {
   private static final alr G = alr.b("textures/gui/container/crafting_table.png");

   public gat(cwu $$0, csh $$1, xg $$2) {
      super($$0, new gdl($$0), $$1, $$2);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.v = 29;
   }

   @Override
   protected fye G() {
      return new fye(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(ftk $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gry::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
