public class gqk extends gop<cjr, gvx, fzz> {
   private static final alc a = alc.b("textures/entity/wither/wither_invulnerable.png");
   private static final alc b = alc.b("textures/entity/wither/wither.png");

   public gqk(gnj.a $$0) {
      super($$0, new fzz($$0.a(gak.cZ)), 1.0F);
      this.a(new gsj(this, $$0.f()));
   }

   protected int a(cjr $$0, je $$1) {
      return 15;
   }

   public alc a(gvx $$0) {
      int $$1 = azd.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : b;
   }

   public gvx c() {
      return new gvx();
   }

   protected void a(gvx $$0, fde $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(cjr $$0, gvx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.gq();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.gp(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.y(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.gr();
   }
}
