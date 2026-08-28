public class gvg extends gtk<ckp, hay, ger> {
   private static final akv a = akv.b("textures/entity/wither/wither_invulnerable.png");
   private static final akv b = akv.b("textures/entity/wither/wither.png");

   public gvg(gse.a $$0) {
      super($$0, new ger($$0.a(gfc.dA)), 1.0F);
      this.a(new gxg(this, $$0.f()));
   }

   protected int a(ckp $$0, ji $$1) {
      return 15;
   }

   public akv a(hay $$0) {
      int $$1 = ayz.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : b;
   }

   public hay b() {
      return new hay();
   }

   protected void a(hay $$0, ffu $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(ckp $$0, hay $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.gs();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.x(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.t(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.gt();
   }
}
