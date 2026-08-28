public class gmk extends gnl<clb, ftl<clb>> {
   private static final alf a = new alf("textures/entity/breeze/breeze_wind.png");
   private static final ftl<clb> b = new ftl<>(ftl.a(128, 128).a());

   public gmk(gkv<clb, ftl<clb>> $$0) {
      super($$0);
   }

   public void a(faa $$0, gdq $$1, int $$2, clb $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      fae $$11 = $$1.getBuffer(gdy.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gif.a(b, b.e()).a($$0, $$11, $$2, gos.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
