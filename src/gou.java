public class gou extends gpf<cgy, guv, fyo> {
   private static final alh a = alh.b("textures/entity/iron_golem/iron_golem.png");

   public gou(gnz.a $$0) {
      super($$0, new fyo($$0.a(gba.ba)), 0.7F);
      this.a(new gsd(this));
      this.a(new gse(this, $$0.d()));
   }

   public alh a(guv $$0) {
      return a;
   }

   public guv c() {
      return new guv();
   }

   public void a(cgy $$0, guv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.y() > 0.0F ? (float)$$0.y() - $$2 : 0.0F;
      $$1.b = $$0.gv();
      $$1.c = $$0.t();
   }

   protected void a(guv $$0, fdt $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.Y < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.X + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
