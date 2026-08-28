public class fvo extends fvc<csv> {
   private static final akv G = akv.b("textures/gui/container/crafting_table.png");

   public fvo(csv $$0, cow $$1, wp $$2) {
      super($$0, new fye($$0), $$1, $$2);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.v = 29;
   }

   @Override
   protected fsz G() {
      return new fsz(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(foe $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gmi::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
