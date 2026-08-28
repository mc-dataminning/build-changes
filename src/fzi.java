public class fzi extends fzj<gvo> {
   private static final int a = 4;
   private static final int[][] b = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
   private static final int[][] c = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
   private final gcl[] d = new gcl[4];

   public fzi(gcl $$0) {
      super($$0);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.d[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "segment" + $$0;
   }

   public static gcr a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      float $$2 = -3.5F;

      for (int $$3 = 0; $$3 < 4; $$3++) {
         $$1.a(
            a($$3),
            gcq.c().a(c[$$3][0], c[$$3][1]).a((float)b[$$3][0] * -0.5F, 0.0F, (float)b[$$3][2] * -0.5F, (float)b[$$3][0], (float)b[$$3][1], (float)b[$$3][2]),
            gcn.a(0.0F, (float)(24 - b[$$3][1]), $$2)
         );
         if ($$3 < 3) {
            $$2 += (float)(b[$$3][2] + b[$$3 + 1][2]) * 0.5F;
         }
      }

      return gcr.a($$0, 64, 32);
   }

   @Override
   public void a(gvo $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.length; $$1++) {
         this.d[$$1].f = azm.b($$0.p * 0.9F + (float)$$1 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.01F * (float)(1 + Math.abs($$1 - 2));
         this.d[$$1].b = azm.a($$0.p * 0.9F + (float)$$1 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.1F * (float)Math.abs($$1 - 2);
      }
   }
}
