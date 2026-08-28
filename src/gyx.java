public class gyx extends gxz<cou, hev, gij> {
   public static final alg a = alg.b("textures/entity/slime/slime.png");

   public gyx(gwt.a $$0) {
      super($$0, new gij($$0.a(gjn.de)), 0.25F);
      this.a(new hbl(this, $$0.f()));
   }

   protected float a(hev $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hev $$0, fjy $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public alg b(hev $$0) {
      return a;
   }

   public hev b() {
      return new hev();
   }

   public void a(cou $$0, hev $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bG, $$0.bF);
      $$1.b = $$0.gr();
   }
}
