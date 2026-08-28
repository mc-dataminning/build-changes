public class gzb extends gxf<cmq, hes, gii> {
   private static final alg a = alg.b("textures/entity/wither/wither_invulnerable.png");
   private static final alg j = alg.b("textures/entity/wither/wither.png");

   public gzb(gvz.a $$0) {
      super($$0, new gii($$0.a(git.dQ)), 1.0F);
      this.a(new hba(this, $$0.f()));
   }

   protected int a(cmq $$0, iu $$1) {
      return 15;
   }

   public alg a(hes $$0) {
      int $$1 = azm.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : j;
   }

   public hes b() {
      return new hes();
   }

   protected void a(hes $$0, fjc $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(cmq $$0, hes $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.t();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.q(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.n(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.x();
   }
}
