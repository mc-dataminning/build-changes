public class goe extends gop<cgm, gue, fxz> {
   private static final alc a = alc.b("textures/entity/iron_golem/iron_golem.png");

   public goe(gnj.a $$0) {
      super($$0, new fxz($$0.a(gak.ba)), 0.7F);
      this.a(new grn(this));
      this.a(new gro(this, $$0.d()));
   }

   public alc a(gue $$0) {
      return a;
   }

   public gue c() {
      return new gue();
   }

   public void a(cgm $$0, gue $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.y() > 0.0F ? (float)$$0.y() - $$2 : 0.0F;
      $$1.b = $$0.gp();
      $$1.c = $$0.t();
   }

   protected void a(gue $$0, fde $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.Y < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.X + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
