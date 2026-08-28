public class fwz extends fxa<gsu> {
   private static final int a = 4;
   private static final int[][] b = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
   private static final int[][] c = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
   private final gab d;
   private final gab[] e;

   public fwz(gab $$0) {
      this.d = $$0;
      this.e = new gab[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.e[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "segment" + $$0;
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      float $$2 = -3.5F;

      for (int $$3 = 0; $$3 < 4; $$3++) {
         $$1.a(
            a($$3),
            gag.c().a(c[$$3][0], c[$$3][1]).a((float)b[$$3][0] * -0.5F, 0.0F, (float)b[$$3][2] * -0.5F, (float)b[$$3][0], (float)b[$$3][1], (float)b[$$3][2]),
            gad.a(0.0F, (float)(24 - b[$$3][1]), $$2)
         );
         if ($$3 < 3) {
            $$2 += (float)(b[$$3][2] + b[$$3 + 1][2]) * 0.5F;
         }
      }

      return gah.a($$0, 64, 32);
   }

   @Override
   public gab a() {
      return this.d;
   }

   @Override
   public void a(gsu $$0) {
      for (int $$1 = 0; $$1 < this.e.length; $$1++) {
         this.e[$$1].f = azc.b($$0.p * 0.9F + (float)$$1 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.01F * (float)(1 + Math.abs($$1 - 2));
         this.e[$$1].b = azc.a($$0.p * 0.9F + (float)$$1 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.1F * (float)Math.abs($$1 - 2);
      }
   }
}
