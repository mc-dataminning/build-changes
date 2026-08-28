public class gpt extends gny<cjm, gvg, fzp> {
   private static final alb a = alb.b("textures/entity/wither/wither_invulnerable.png");
   private static final alb b = alb.b("textures/entity/wither/wither.png");

   public gpt(gms.a $$0) {
      super($$0, new fzp($$0.a(gaa.cY)), 1.0F);
      this.a(new grs(this, $$0.f()));
   }

   protected int a(cjm $$0, je $$1) {
      return 15;
   }

   public alb a(gvg $$0) {
      int $$1 = azc.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : b;
   }

   public gvg c() {
      return new gvg();
   }

   protected void a(gvg $$0, fcu $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(cjm $$0, gvg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.gp();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.go(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.y(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.gq();
   }
}
