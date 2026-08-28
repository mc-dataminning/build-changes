public class gqo extends gqq<clx, gxk, fzz> {
   private static final alj a = alj.b("textures/entity/slime/magmacube.png");

   public gqo(gpk.a $$0) {
      super($$0, new fzz($$0.a(gck.bt)), 0.25F);
   }

   protected int a(clx $$0, jh $$1) {
      return 15;
   }

   public alj a(gxk $$0) {
      return a;
   }

   public gxk b() {
      return new gxk();
   }

   public void a(clx $$0, gxk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gn();
   }

   public void a(gxk $$0, fer $$1, gjg $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gxk $$0, fer $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
