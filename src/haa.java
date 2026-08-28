public class haa extends gye<cne, hfs, gjh> {
   private static final alg a = alg.b("textures/entity/wither/wither_invulnerable.png");
   private static final alg j = alg.b("textures/entity/wither/wither.png");

   public haa(gwy.a $$0) {
      super($$0, new gjh($$0.a(gjs.dU)), 1.0F);
      this.a(new hca(this, $$0.f()));
   }

   protected int a(cne $$0, iv $$1) {
      return 15;
   }

   public alg a(hfs $$0) {
      int $$1 = azm.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : j;
   }

   public hfs b() {
      return new hfs();
   }

   protected void a(hfs $$0, fkd $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(cne $$0, hfs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.t();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.q(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.n(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.x();
   }
}
