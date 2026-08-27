public class gig extends gfh<clb> {
   private static final ajt a = new ajt("textures/entity/projectiles/wind_charge.png");
   private final fta f;

   public gig(gfi.a $$0) {
      super($$0);
      this.f = new fta($$0.a(ftl.bT));
   }

   public void a(clb $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      float $$6 = (float)$$0.ah + $$2;
      ewm $$7 = $$4.getBuffer(gah.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public ajt a(clb $$0) {
      return a;
   }
}
