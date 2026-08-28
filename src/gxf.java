public class gxf extends gue<crr, hak> {
   private static final ald a = ald.b("textures/entity/projectiles/wind_charge.png");
   private final ggp g;

   public gxf(guf.a $$0) {
      super($$0);
      this.g = new ggp($$0.a(ghc.dK));
   }

   @Override
   public void a(hak $$0, fho $$1, gny $$2, int $$3) {
      fhs $$4 = $$2.getBuffer(goi.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.g.a($$0);
      this.g.a($$1, $$4, $$3, hgi.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public hak d() {
      return new hak();
   }
}
