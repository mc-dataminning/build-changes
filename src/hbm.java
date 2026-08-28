public class hbm extends gzq<cnr, hhe, gku> {
   private static final alk a = alk.b("textures/entity/wither/wither_invulnerable.png");
   private static final alk j = alk.b("textures/entity/wither/wither.png");

   public hbm(gyk.a $$0) {
      super($$0, new gku($$0.a(glf.dU)), 1.0F);
      this.a(new hdm(this, $$0.f()));
   }

   protected int a(cnr $$0, iw $$1) {
      return 15;
   }

   public alk a(hhe $$0) {
      int $$1 = azq.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : j;
   }

   public hhe b() {
      return new hhe();
   }

   protected void a(hhe $$0, flq $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(cnr $$0, hhe $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.t();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.q(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.n(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.x();
   }
}
