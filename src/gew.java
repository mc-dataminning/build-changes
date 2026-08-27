public class gew extends gbx<cjg> {
   private static final ajc a = new ajc("textures/entity/projectiles/wind_charge.png");
   private final fpt f;

   public gew(gby.a $$0) {
      super($$0);
      this.f = new fpt($$0.a(fqe.bP));
   }

   public void a(cjg $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      float $$6 = (float)$$0.ag + $$2;
      eth $$7 = $$4.getBuffer(fwy.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public ajc a(cjg $$0) {
      return a;
   }
}
