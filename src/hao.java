public class hao extends gzq<cpk, hgn, gkb> {
   public static final alk a = alk.b("textures/entity/slime/slime.png");

   public hao(gyk.a $$0) {
      super($$0, new gkb($$0.a(glf.dg)), 0.25F);
      this.a(new hdd(this, $$0.f()));
   }

   protected float a(hgn $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hgn $$0, flq $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public alk b(hgn $$0) {
      return a;
   }

   public hgn b() {
      return new hgn();
   }

   public void a(cpk $$0, hgn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azq.h($$2, $$0.f, $$0.e);
      $$1.b = $$0.gs();
   }
}
