public class gos extends gnu<clj, gxs, fyv> {
   private static final all a = all.b("textures/entity/zombie/drowned.png");

   public gos(gpa.a $$0) {
      super($$0, new fyv($$0.a(gcb.ai)), new fyv($$0.a(gcb.am)), new fyv($$0.a(gcb.aj)), new fyv($$0.a(gcb.ak)), new fyv($$0.a(gcb.an)), new fyv($$0.a(gcb.ao)));
      this.a(new gsv(this, $$0.f()));
   }

   public gxs a() {
      return new gxs();
   }

   @Override
   public all a(gxs $$0) {
      return a;
   }

   protected void a(gxs $$0, fek $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.B;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.V;
         float $$6 = azn.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.r / 2.0F / $$3, 0.0F);
      }
   }
}
