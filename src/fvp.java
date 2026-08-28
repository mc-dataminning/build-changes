public class fvp {
   public static final fvp a = new fvp("Merry X-mas!");
   public static final fvp b = new fvp("Happy new year!");
   public static final fvp c = new fvp("OOoooOOOoooo! Spooky!");
   private static final int d = 123;
   private static final int e = 69;
   private final String f;

   public fvp(String $$0) {
      this.f = $$0;
   }

   public void a(ftx $$0, int $$1, ftv $$2, int $$3) {
      $$0.c().a();
      $$0.c().a((float)$$1 / 2.0F + 123.0F, 69.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      float $$4 = 1.8F - azo.e(azo.a((float)(ag.c() % 1000L) / 1000.0F * (float) (Math.PI * 2)) * 0.1F);
      $$4 = $$4 * 100.0F / (float)($$2.b(this.f) + 32);
      $$0.c().b($$4, $$4, $$4);
      $$0.a($$2, this.f, 0, -8, 16776960 | $$3);
      $$0.c().b();
   }
}
