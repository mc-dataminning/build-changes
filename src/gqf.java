public class gqf extends gqq<chk, gwh, fzy> {
   private static final alj a = alj.b("textures/entity/iron_golem/iron_golem.png");

   public gqf(gpk.a $$0) {
      super($$0, new fzy($$0.a(gck.bk)), 0.7F);
      this.a(new gtp(this));
      this.a(new gtq(this, $$0.d()));
   }

   public alj a(gwh $$0) {
      return a;
   }

   public gwh b() {
      return new gwh();
   }

   public void a(chk $$0, gwh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.v() > 0.0F ? (float)$$0.v() - $$2 : 0.0F;
      $$1.b = $$0.gm();
      $$1.c = $$0.q();
   }

   protected void a(gwh $$0, fer $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.Y < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.X + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
