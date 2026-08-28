public class gun extends gsr<clf, hac, gdx> {
   private static final alp a = alp.b("textures/entity/wither/wither_invulnerable.png");
   private static final alp b = alp.b("textures/entity/wither/wither.png");

   public gun(grl.a $$0) {
      super($$0, new gdx($$0.a(gei.dA)), 1.0F);
      this.a(new gwn(this, $$0.f()));
   }

   protected int a(clf $$0, jh $$1) {
      return 15;
   }

   public alp a(hac $$0) {
      int $$1 = azu.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : b;
   }

   public hac b() {
      return new hac();
   }

   protected void a(hac $$0, fgl $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(clf $$0, hac $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.go();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.x(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.t(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.gp();
   }
}
