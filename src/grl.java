public class grl extends gpq<cki, gwz, gba> {
   private static final ali a = ali.b("textures/entity/wither/wither_invulnerable.png");
   private static final ali b = ali.b("textures/entity/wither/wither.png");

   public grl(gok.a $$0) {
      super($$0, new gba($$0.a(gbl.cZ)), 1.0F);
      this.a(new gtl(this, $$0.f()));
   }

   protected int a(cki $$0, jh $$1) {
      return 15;
   }

   public ali a(gwz $$0) {
      int $$1 = azk.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : b;
   }

   public gwz c() {
      return new gwz();
   }

   protected void a(gwz $$0, feb $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(cki $$0, gwz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.gv();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.gu(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.y(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.gw();
   }
}
