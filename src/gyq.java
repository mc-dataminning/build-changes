public class gyq extends gzb<ckl, hey, gid> {
   private static final alr a = alr.b("textures/entity/iron_golem/iron_golem.png");

   public gyq(gxv.a $$0) {
      super($$0, new gid($$0.a(gkq.bA)), 0.7F);
      this.a(new hbz(this));
      this.a(new hca(this, $$0.d()));
   }

   public alr a(hey $$0) {
      return a;
   }

   public hey b() {
      return new hey();
   }

   public void a(ckl $$0, hey $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.n() > 0.0F ? (float)$$0.n() - $$2 : 0.0F;
      $$1.b = $$0.q();
      $$1.c = $$0.m();
   }

   protected void a(hey $$0, fld $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!((double)$$0.ah < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.ag + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
