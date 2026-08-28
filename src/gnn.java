public class gnn extends gny<cgh, gtn, fxp> {
   private static final alb a = alb.b("textures/entity/iron_golem/iron_golem.png");

   public gnn(gms.a $$0) {
      super($$0, new fxp($$0.a(gaa.ba)), 0.7F);
      this.a(new gqw(this));
      this.a(new gqx(this, $$0.d()));
   }

   public alb a(gtn $$0) {
      return a;
   }

   public gtn c() {
      return new gtn();
   }

   public void a(cgh $$0, gtn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.y() > 0.0F ? (float)$$0.y() - $$2 : 0.0F;
      $$1.b = $$0.go();
      $$1.c = $$0.t();
   }

   protected void a(gtn $$0, fcu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.Y < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.X + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
