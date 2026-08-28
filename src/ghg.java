import java.util.Arrays;

public class ghg extends ggp<hfb> {
   private static final int a = 8;
   private final gjt[] b = new gjt[8];

   public ghg(gjt $$0) {
      super($$0);
      Arrays.setAll(this.b, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "cube" + $$0;
   }

   public static gjz a() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();

      for (int $$2 = 0; $$2 < 8; $$2++) {
         int $$3 = 0;
         int $$4 = 0;
         if ($$2 > 0 && $$2 < 4) {
            $$4 += 9 * $$2;
         } else if ($$2 > 3) {
            $$3 = 32;
            $$4 += 9 * $$2 - 36;
         }

         $$1.a(a($$2), gjy.c().a($$3, $$4).a(-4.0F, (float)(16 + $$2), -4.0F, 8.0F, 1.0F, 8.0F), gjv.a);
      }

      $$1.a("inside_cube", gjy.c().a(24, 40).a(-2.0F, 18.0F, -2.0F, 4.0F, 4.0F, 4.0F), gjv.a);
      return gjz.a($$0, 64, 64);
   }

   public void a(hfb $$0) {
      super.a($$0);
      float $$1 = Math.max(0.0F, $$0.a);

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         this.b[$$2].c = (float)(-(4 - $$2)) * $$1 * 1.7F;
      }
   }
}
