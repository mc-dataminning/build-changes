public class gpc extends goe<clm, gyd, fze> {
   private static final alj a = alj.b("textures/entity/zombie/drowned.png");

   public gpc(gpk.a $$0) {
      super($$0, new fze($$0.a(gck.as)), new fze($$0.a(gck.at)), new fze($$0.a(gck.ax)), new fze($$0.a(gck.ay)), new fze($$0.a(gck.au)), new fze($$0.a(gck.av)));
      this.a(new gtg(this, $$0.f()));
   }

   public gyd a() {
      return new gyd();
   }

   @Override
   public alj a(gyd $$0) {
      return a;
   }

   protected void a(gyd $$0, fer $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.B;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.V;
         float $$6 = azm.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.r / 2.0F / $$3, 0.0F);
      }
   }
}
