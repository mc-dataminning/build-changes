public class fva extends fuo<ctu> {
   private static final alz G = alz.b("textures/gui/container/crafting_table.png");

   public fva(ctu $$0, cpv $$1, xv $$2) {
      super($$0, new fxq($$0), $$1, $$2);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.v = 29;
   }

   @Override
   protected fsl G() {
      return new fsl(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(fnr $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(glu::C, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
