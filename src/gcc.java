import java.util.Arrays;

public class gcc extends gbm<gzr> {
   private static final int a = 8;
   private final geo[] b = new geo[8];

   public gcc(geo $$0) {
      super($$0);
      Arrays.setAll(this.b, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "cube" + $$0;
   }

   public static geu a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();

      for (int $$2 = 0; $$2 < 8; $$2++) {
         int $$3 = 0;
         int $$4 = $$2;
         if ($$2 == 2) {
            $$3 = 24;
            $$4 = 10;
         } else if ($$2 == 3) {
            $$3 = 24;
            $$4 = 19;
         }

         $$1.a(a($$2), get.c().a($$3, $$4).a(-4.0F, (float)(16 + $$2), -4.0F, 8.0F, 1.0F, 8.0F), geq.a);
      }

      $$1.a("inside_cube", get.c().a(0, 16).a(-2.0F, 18.0F, -2.0F, 4.0F, 4.0F, 4.0F), geq.a);
      return geu.a($$0, 64, 32);
   }

   public void a(gzr $$0) {
      super.a($$0);
      float $$1 = Math.max(0.0F, $$0.a);

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         this.b[$$2].c = (float)(-(4 - $$2)) * $$1 * 1.7F;
      }
   }
}
