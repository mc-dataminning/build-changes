public class fvp extends fvd<csw> {
   private static final akv G = akv.b("textures/gui/container/crafting_table.png");

   public fvp(csw $$0, cox $$1, wp $$2) {
      super($$0, new fyf($$0), $$1, $$2);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.v = 29;
   }

   @Override
   protected fta G() {
      return new fta(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(fof $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gmj::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
