public class gbl extends fym<cgn> {
   private static final ahg a = new ahg("textures/entity/projectiles/wind_charge.png");
   private final fml f;

   public gbl(fyn.a $$0) {
      super($$0);
      this.f = new fml($$0.a(fmw.bQ));
   }

   public void a(cgn $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      float $$6 = (float)$$0.ah + $$2;
      eqf $$7 = $$4.getBuffer(ftp.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gee.d, 1.0F, 1.0F, 1.0F, 0.5F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public ahg a(cgn $$0) {
      return a;
   }
}
