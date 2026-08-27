public class fxt extends fzl<cbv, fjj<cbv>> {
   private static final ahd a = new ahd("textures/entity/creeper/creeper.png");

   public fxt(fyf.a $$0) {
      super($$0, new fjj<>($$0.a(fmo.E)), 0.5F);
      this.a(new gbt(this, $$0.f()));
   }

   protected void a(cbv $$0, ept $$1, float $$2) {
      float $$3 = $$0.E($$2);
      float $$4 = 1.0F + aui.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = aui.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cbv $$0, float $$1) {
      float $$2 = $$0.E($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : aui.a($$2, 0.5F, 1.0F);
   }

   public ahd a(cbv $$0) {
      return a;
   }
}
