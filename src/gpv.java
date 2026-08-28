public class gpv extends gqg<chh, gvw, fzp> {
   private static final all a = all.b("textures/entity/iron_golem/iron_golem.png");

   public gpv(gpa.a $$0) {
      super($$0, new fzp($$0.a(gcb.ba)), 0.7F);
      this.a(new gte(this));
      this.a(new gtf(this, $$0.d()));
   }

   public all a(gvw $$0) {
      return a;
   }

   public gvw c() {
      return new gvw();
   }

   public void a(chh $$0, gvw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.y() > 0.0F ? (float)$$0.y() - $$2 : 0.0F;
      $$1.b = $$0.gv();
      $$1.c = $$0.t();
   }

   protected void a(gvw $$0, fek $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.Y < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.X + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
