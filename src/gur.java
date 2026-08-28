public class gur extends gsv<cln, hag, geb> {
   private static final alz a = alz.b("textures/entity/wither/wither_invulnerable.png");
   private static final alz b = alz.b("textures/entity/wither/wither.png");

   public gur(grp.a $$0) {
      super($$0, new geb($$0.a(gem.du)), 1.0F);
      this.a(new gwr(this, $$0.f()));
   }

   protected int a(cln $$0, jh $$1) {
      return 15;
   }

   public alz a(hag $$0) {
      int $$1 = bae.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : b;
   }

   public hag b() {
      return new hag();
   }

   protected void a(hag $$0, fgr $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(cln $$0, hag $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.go();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.x(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.t(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.gp();
   }
}
