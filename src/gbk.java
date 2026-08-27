public class gbk extends fyl<cgm> {
   private static final ahg a = new ahg("textures/entity/projectiles/wind_charge.png");
   private final fmk f;

   public gbk(fym.a $$0) {
      super($$0);
      this.f = new fmk($$0.a(fmv.bQ));
   }

   public void a(cgm $$0, float $$1, float $$2, eqa $$3, ftg $$4, int $$5) {
      float $$6 = (float)$$0.ah + $$2;
      eqe $$7 = $$4.getBuffer(fto.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, ged.d, 1.0F, 1.0F, 1.0F, 0.5F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public ahg a(cgm $$0) {
      return a;
   }
}
