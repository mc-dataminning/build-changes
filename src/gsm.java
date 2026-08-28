public class gsm extends gqq<ckp, gya, gbz> {
   private static final alj a = alj.b("textures/entity/wither/wither_invulnerable.png");
   private static final alj b = alj.b("textures/entity/wither/wither.png");

   public gsm(gpk.a $$0) {
      super($$0, new gbz($$0.a(gck.dr)), 1.0F);
      this.a(new gum(this, $$0.f()));
   }

   protected int a(ckp $$0, jh $$1) {
      return 15;
   }

   public alj a(gya $$0) {
      int $$1 = azm.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : b;
   }

   public gya b() {
      return new gya();
   }

   protected void a(gya $$0, fer $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(ckp $$0, gya $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.gn();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.gm(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.v(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.go();
   }
}
