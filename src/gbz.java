public class gbz extends gca<gyi> {
   private static final int a = 4;
   private static final int[][] b = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
   private static final int[][] c = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
   private final gfc[] d = new gfc[4];

   public gbz(gfc $$0) {
      super($$0);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.d[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "segment" + $$0;
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      float $$2 = -3.5F;

      for (int $$3 = 0; $$3 < 4; $$3++) {
         $$1.a(
            a($$3),
            gfh.c().a(c[$$3][0], c[$$3][1]).a((float)b[$$3][0] * -0.5F, 0.0F, (float)b[$$3][2] * -0.5F, (float)b[$$3][0], (float)b[$$3][1], (float)b[$$3][2]),
            gfe.a(0.0F, (float)(24 - b[$$3][1]), $$2)
         );
         if ($$3 < 3) {
            $$2 += (float)(b[$$3][2] + b[$$3 + 1][2]) * 0.5F;
         }
      }

      return gfi.a($$0, 64, 32);
   }

   @Override
   public void a(gyi $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.length; $$1++) {
         this.d[$$1].f = ayz.b($$0.u * 0.9F + (float)$$1 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.01F * (float)(1 + Math.abs($$1 - 2));
         this.d[$$1].b = ayz.a($$0.u * 0.9F + (float)$$1 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.1F * (float)Math.abs($$1 - 2);
      }
   }
}
