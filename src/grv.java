public class grv extends gqg<coc, gxm, gbm> {
   private static final all b = all.b("textures/entity/villager/villager.png");
   public static final gss.a a = new gss.a(-0.1171875F, -0.07421875F, 1.0F);

   public grv(gpa.a $$0) {
      super($$0, new gbm($$0.a(gcb.cT)), 0.5F);
      this.a(new gss<>(this, $$0.f(), a, $$0.b()));
      this.a(new gtx<>(this, $$0.e(), "villager"));
      this.a(new gsr<>(this, $$0.b()));
   }

   protected void a(gxm $$0, fek $$1) {
      super.a($$0, $$1);
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   public all a(gxm $$0) {
      return b;
   }

   protected float b(gxm $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gxm c() {
      return new gxm();
   }

   public void a(coc $$0, gxm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gF();
   }
}
