public class gah extends fzl<ccs, fln<ccs>> {
   private static final ahd a = new ahd("textures/entity/slime/slime.png");

   public gah(fyf.a $$0) {
      super($$0, new fln<>($$0.a(fmo.bp)), 0.25F);
      this.a(new gcu<>(this, $$0.f()));
   }

   public void a(ccs $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ccs $$0, ept $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.gf();
      float $$5 = aui.i($$2, $$0.bS, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public ahd a(ccs $$0) {
      return a;
   }
}
