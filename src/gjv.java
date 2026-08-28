import java.util.Arrays;

public class gjv extends gia<hep> {
   private static final int a = 7;
   private final gle[] b = new gle[7];
   private final gle[] c = new gle[3];
   private static final int[][] d = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
   private static final int[][] e = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

   public gjv(gle $$0) {
      super($$0);
      Arrays.setAll(this.b, $$1 -> $$0.b(b($$1)));
      Arrays.setAll(this.c, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "layer" + $$0;
   }

   private static String b(int $$0) {
      return "segment" + $$0;
   }

   public static glk a() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      float[] $$2 = new float[7];
      float $$3 = -3.5F;

      for (int $$4 = 0; $$4 < 7; $$4++) {
         $$1.a(
            b($$4),
            glj.c().a(e[$$4][0], e[$$4][1]).a((float)d[$$4][0] * -0.5F, 0.0F, (float)d[$$4][2] * -0.5F, (float)d[$$4][0], (float)d[$$4][1], (float)d[$$4][2]),
            glg.a(0.0F, (float)(24 - d[$$4][1]), $$3)
         );
         $$2[$$4] = $$3;
         if ($$4 < 6) {
            $$3 += (float)(d[$$4][2] + d[$$4 + 1][2]) * 0.5F;
         }
      }

      $$1.a(a(0), glj.c().a(20, 0).a(-5.0F, 0.0F, (float)d[2][2] * -0.5F, 10.0F, 8.0F, (float)d[2][2]), glg.a(0.0F, 16.0F, $$2[2]));
      $$1.a(a(1), glj.c().a(20, 11).a(-3.0F, 0.0F, (float)d[4][2] * -0.5F, 6.0F, 4.0F, (float)d[4][2]), glg.a(0.0F, 20.0F, $$2[4]));
      $$1.a(a(2), glj.c().a(20, 18).a(-3.0F, 0.0F, (float)d[4][2] * -0.5F, 6.0F, 5.0F, (float)d[1][2]), glg.a(0.0F, 19.0F, $$2[1]));
      return glk.a($$0, 64, 32);
   }

   @Override
   public void a(hep $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         this.b[$$1].f = azo.b($$0.u * 0.9F + (float)$$1 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.05F * (float)(1 + Math.abs($$1 - 2));
         this.b[$$1].b = azo.a($$0.u * 0.9F + (float)$$1 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.2F * (float)Math.abs($$1 - 2);
      }

      this.c[0].f = this.b[2].f;
      this.c[1].f = this.b[4].f;
      this.c[1].b = this.b[4].b;
      this.c[2].f = this.b[1].f;
      this.c[2].b = this.b[1].b;
   }
}
