import java.util.Arrays;

public class fxm<T extends brv> extends fvz<T> {
   private static final int a = 7;
   private final fys b;
   private final fys[] f = new fys[7];
   private final fys[] g = new fys[3];
   private static final int[][] h = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
   private static final int[][] i = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

   public fxm(fys $$0) {
      this.b = $$0;
      Arrays.setAll(this.f, $$1 -> $$0.b(b($$1)));
      Arrays.setAll(this.g, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "layer" + $$0;
   }

   private static String b(int $$0) {
      return "segment" + $$0;
   }

   public static fyy b() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      float[] $$2 = new float[7];
      float $$3 = -3.5F;

      for (int $$4 = 0; $$4 < 7; $$4++) {
         $$1.a(
            b($$4),
            fyx.c().a(i[$$4][0], i[$$4][1]).a((float)h[$$4][0] * -0.5F, 0.0F, (float)h[$$4][2] * -0.5F, (float)h[$$4][0], (float)h[$$4][1], (float)h[$$4][2]),
            fyu.a(0.0F, (float)(24 - h[$$4][1]), $$3)
         );
         $$2[$$4] = $$3;
         if ($$4 < 6) {
            $$3 += (float)(h[$$4][2] + h[$$4 + 1][2]) * 0.5F;
         }
      }

      $$1.a(a(0), fyx.c().a(20, 0).a(-5.0F, 0.0F, (float)h[2][2] * -0.5F, 10.0F, 8.0F, (float)h[2][2]), fyu.a(0.0F, 16.0F, $$2[2]));
      $$1.a(a(1), fyx.c().a(20, 11).a(-3.0F, 0.0F, (float)h[4][2] * -0.5F, 6.0F, 4.0F, (float)h[4][2]), fyu.a(0.0F, 20.0F, $$2[4]));
      $$1.a(a(2), fyx.c().a(20, 18).a(-3.0F, 0.0F, (float)h[4][2] * -0.5F, 6.0F, 5.0F, (float)h[1][2]), fyu.a(0.0F, 19.0F, $$2[1]));
      return fyy.a($$0, 64, 32);
   }

   @Override
   public fys a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      for (int $$6 = 0; $$6 < this.f.length; $$6++) {
         this.f[$$6].f = aym.b($$3 * 0.9F + (float)$$6 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.05F * (float)(1 + Math.abs($$6 - 2));
         this.f[$$6].b = aym.a($$3 * 0.9F + (float)$$6 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.2F * (float)Math.abs($$6 - 2);
      }

      this.g[0].f = this.f[2].f;
      this.g[1].f = this.f[4].f;
      this.g[1].b = this.f[4].b;
      this.g[2].f = this.f[1].f;
      this.g[2].b = this.f[1].b;
   }
}
