public class gbi extends gaw<cwl> {
   private static final alk G = alk.b("textures/gui/container/crafting_table.png");

   public gbi(cwl $$0, cry $$1, xc $$2) {
      super($$0, new gea($$0), $$1, $$2);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.v = 29;
   }

   @Override
   protected fyt G() {
      return new fyt(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(ftz $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gsn::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
