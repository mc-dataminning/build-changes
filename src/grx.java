public class grx extends gqg<coi, gxm, gbm> {
   private static final all a = all.b("textures/entity/wandering_trader.png");

   public grx(gpa.a $$0) {
      super($$0, new gbm($$0.a(gcb.cW)), 0.5F);
      this.a(new gss<>(this, $$0.f(), $$0.b()));
      this.a(new gsr<>(this, $$0.b()));
   }

   public all a(gxm $$0) {
      return a;
   }

   protected void a(gxm $$0, fek $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   public gxm c() {
      return new gxm();
   }

   public void a(coi $$0, gxm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q() > 0;
   }
}
