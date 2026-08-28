import java.util.Arrays;

public class fya extends fxk<gvh> {
   private static final int a = 8;
   private final gal b;
   private final gal[] c = new gal[8];

   public fya(gal $$0) {
      this.b = $$0;
      Arrays.setAll(this.c, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "cube" + $$0;
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();

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

         $$1.a(a($$2), gaq.c().a($$3, $$4).a(-4.0F, (float)(16 + $$2), -4.0F, 8.0F, 1.0F, 8.0F), gan.a);
      }

      $$1.a("inside_cube", gaq.c().a(0, 16).a(-2.0F, 18.0F, -2.0F, 4.0F, 4.0F, 4.0F), gan.a);
      return gar.a($$0, 64, 32);
   }

   public void a(gvh $$0) {
      float $$1 = Math.max(0.0F, $$0.a);

      for (int $$2 = 0; $$2 < this.c.length; $$2++) {
         this.c[$$2].c = (float)(-(4 - $$2)) * $$1 * 1.7F;
      }
   }

   @Override
   public gal a() {
      return this.b;
   }
}
