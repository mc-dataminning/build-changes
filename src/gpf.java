public class gpf extends gpq<chd, gvg, fyz> {
   private static final ali a = ali.b("textures/entity/iron_golem/iron_golem.png");

   public gpf(gok.a $$0) {
      super($$0, new fyz($$0.a(gbl.ba)), 0.7F);
      this.a(new gso(this));
      this.a(new gsp(this, $$0.d()));
   }

   public ali a(gvg $$0) {
      return a;
   }

   public gvg c() {
      return new gvg();
   }

   public void a(chd $$0, gvg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.y() > 0.0F ? (float)$$0.y() - $$2 : 0.0F;
      $$1.b = $$0.gu();
      $$1.c = $$0.t();
   }

   protected void a(gvg $$0, feb $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.Y < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.X + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
