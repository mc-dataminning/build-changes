import java.util.Arrays;

public class fze extends fxk<gtl> {
   private static final int a = 7;
   private final gal b;
   private final gal[] c = new gal[7];
   private final gal[] d = new gal[3];
   private static final int[][] e = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
   private static final int[][] f = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

   public fze(gal $$0) {
      this.b = $$0;
      Arrays.setAll(this.c, $$1 -> $$0.b(b($$1)));
      Arrays.setAll(this.d, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "layer" + $$0;
   }

   private static String b(int $$0) {
      return "segment" + $$0;
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      float[] $$2 = new float[7];
      float $$3 = -3.5F;

      for (int $$4 = 0; $$4 < 7; $$4++) {
         $$1.a(
            b($$4),
            gaq.c().a(f[$$4][0], f[$$4][1]).a((float)e[$$4][0] * -0.5F, 0.0F, (float)e[$$4][2] * -0.5F, (float)e[$$4][0], (float)e[$$4][1], (float)e[$$4][2]),
            gan.a(0.0F, (float)(24 - e[$$4][1]), $$3)
         );
         $$2[$$4] = $$3;
         if ($$4 < 6) {
            $$3 += (float)(e[$$4][2] + e[$$4 + 1][2]) * 0.5F;
         }
      }

      $$1.a(a(0), gaq.c().a(20, 0).a(-5.0F, 0.0F, (float)e[2][2] * -0.5F, 10.0F, 8.0F, (float)e[2][2]), gan.a(0.0F, 16.0F, $$2[2]));
      $$1.a(a(1), gaq.c().a(20, 11).a(-3.0F, 0.0F, (float)e[4][2] * -0.5F, 6.0F, 4.0F, (float)e[4][2]), gan.a(0.0F, 20.0F, $$2[4]));
      $$1.a(a(2), gaq.c().a(20, 18).a(-3.0F, 0.0F, (float)e[4][2] * -0.5F, 6.0F, 5.0F, (float)e[1][2]), gan.a(0.0F, 19.0F, $$2[1]));
      return gar.a($$0, 64, 32);
   }

   @Override
   public gal a() {
      return this.b;
   }

   @Override
   public void a(gtl $$0) {
      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         this.c[$$1].f = azd.b($$0.p * 0.9F + (float)$$1 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.05F * (float)(1 + Math.abs($$1 - 2));
         this.c[$$1].b = azd.a($$0.p * 0.9F + (float)$$1 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.2F * (float)Math.abs($$1 - 2);
      }

      this.d[0].f = this.c[2].f;
      this.d[1].f = this.c[4].f;
      this.d[1].b = this.c[4].b;
      this.d[2].f = this.c[1].f;
      this.d[2].b = this.c[1].b;
   }
}
