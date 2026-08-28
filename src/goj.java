public class goj extends gou<cgp, guj, fyd> {
   private static final ale a = ale.b("textures/entity/iron_golem/iron_golem.png");

   public goj(gno.a $$0) {
      super($$0, new fyd($$0.a(gap.ba)), 0.7F);
      this.a(new grs(this));
      this.a(new grt(this, $$0.d()));
   }

   public ale a(guj $$0) {
      return a;
   }

   public guj c() {
      return new guj();
   }

   public void a(cgp $$0, guj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.y() > 0.0F ? (float)$$0.y() - $$2 : 0.0F;
      $$1.b = $$0.go();
      $$1.c = $$0.t();
   }

   protected void a(guj $$0, fdi $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.Y < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.X + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
