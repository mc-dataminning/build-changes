public class hav extends gxu<ctu, hec> {
   private static final alr a = alr.b("textures/entity/projectiles/wind_charge.png");
   private final gkd g;

   public hav(gxv.a $$0) {
      super($$0);
      this.g = new gkd($$0.a(gkq.dS));
   }

   @Override
   public void a(hec $$0, fld $$1, grn $$2, int $$3) {
      flg $$4 = $$2.getBuffer(gry.a(a, this.a($$0.v) % 1.0F, 0.0F));
      this.g.a($$0);
      this.g.a($$1, $$4, $$3, hkg.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public hec d() {
      return new hec();
   }
}
