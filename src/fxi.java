public class fxi extends fww<cug> {
   private static final ald G = ald.b("textures/gui/container/crafting_table.png");

   public fxi(cug $$0, cqh $$1, wv $$2) {
      super($$0, new gaa($$0), $$1, $$2);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.v = 29;
   }

   @Override
   protected fut G() {
      return new fut(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(fpz $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(goi::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
