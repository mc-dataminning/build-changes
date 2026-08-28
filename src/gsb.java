public class gsb extends gqg<ckm, gxp, gbq> {
   private static final all a = all.b("textures/entity/wither/wither_invulnerable.png");
   private static final all b = all.b("textures/entity/wither/wither.png");

   public gsb(gpa.a $$0) {
      super($$0, new gbq($$0.a(gcb.cZ)), 1.0F);
      this.a(new gub(this, $$0.f()));
   }

   protected int a(ckm $$0, jh $$1) {
      return 15;
   }

   public all a(gxp $$0) {
      int $$1 = azn.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : b;
   }

   public gxp c() {
      return new gxp();
   }

   protected void a(gxp $$0, fek $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(ckm $$0, gxp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.gw();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.gv(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.y(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.gx();
   }
}
