public class gnc extends gkc<cod> {
   private static final akq a = akq.b("textures/entity/projectiles/wind_charge.png");
   private final fxs f;

   public gnc(gkd.a $$0) {
      super($$0);
      this.f = new fxs($$0.a(fyd.bU));
   }

   public void a(cod $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      float $$6 = (float)$$0.ai + $$2;
      fbg $$7 = $$4.getBuffer(gfb.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gpw.d);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public akq a(cod $$0) {
      return a;
   }
}
