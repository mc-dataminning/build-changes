import java.util.Arrays;

public class gir extends gia<hgl> {
   private static final int a = 8;
   private final gle[] b = new gle[8];

   public gir(gle $$0) {
      super($$0);
      Arrays.setAll(this.b, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "cube" + $$0;
   }

   public static glk a() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();

      for (int $$2 = 0; $$2 < 8; $$2++) {
         int $$3 = 0;
         int $$4 = 0;
         if ($$2 > 0 && $$2 < 4) {
            $$4 += 9 * $$2;
         } else if ($$2 > 3) {
            $$3 = 32;
            $$4 += 9 * $$2 - 36;
         }

         $$1.a(a($$2), glj.c().a($$3, $$4).a(-4.0F, (float)(16 + $$2), -4.0F, 8.0F, 1.0F, 8.0F), glg.a);
      }

      $$1.a("inside_cube", glj.c().a(24, 40).a(-2.0F, 18.0F, -2.0F, 4.0F, 4.0F, 4.0F), glg.a);
      return glk.a($$0, 64, 64);
   }

   public void a(hgl $$0) {
      super.a($$0);
      float $$1 = Math.max(0.0F, $$0.a);

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         this.b[$$2].c = (float)(-(4 - $$2)) * $$1 * 1.7F;
      }
   }
}
