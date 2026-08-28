public class hax extends gzb<coa, hgs, gkf> {
   private static final alr a = alr.b("textures/entity/wither/wither_invulnerable.png");
   private static final alr j = alr.b("textures/entity/wither/wither.png");

   public hax(gxv.a $$0) {
      super($$0, new gkf($$0.a(gkq.dU)), 1.0F);
      this.a(new hcx(this, $$0.f()));
   }

   protected int a(coa $$0, iw $$1) {
      return 15;
   }

   public alr a(hgs $$0) {
      int $$1 = azz.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : j;
   }

   public hgs b() {
      return new hgs();
   }

   protected void a(hgs $$0, fld $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(coa $$0, hgs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.t();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.q(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.n(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.x();
   }
}
