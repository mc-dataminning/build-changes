public class hbi extends hcj<hdp, ggt> {
   private static final alr a = alr.b("textures/entity/breeze/breeze_wind.png");
   private final ggt b;

   public hbi(gxv.a $$0, gzs<hdp, ggt> $$1) {
      super($$1);
      this.b = new ggt($$0.a(gkq.L));
   }

   public void a(fld $$0, grn $$1, int $$2, hdp $$3, float $$4, float $$5) {
      flg $$6 = $$1.getBuffer(gry.a(a, this.a($$3.v) % 1.0F, 0.0F));
      this.b.a($$3);
      gxa.a(this.b, this.b.d()).a($$0, $$6, $$2, hkg.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
