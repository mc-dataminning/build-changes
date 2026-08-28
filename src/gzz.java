public class gzz extends gzb<cpt, hgb, gjm> {
   public static final alr a = alr.b("textures/entity/slime/slime.png");

   public gzz(gxv.a $$0) {
      super($$0, new gjm($$0.a(gkq.dg)), 0.25F);
      this.a(new hco(this, $$0.f()));
   }

   protected float a(hgb $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hgb $$0, fld $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public alr b(hgb $$0) {
      return a;
   }

   public hgb b() {
      return new hgb();
   }

   public void a(cpt $$0, hgb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azz.h($$2, $$0.f, $$0.e);
      $$1.b = $$0.gv();
   }
}
