import java.util.Arrays;

public class fzm extends fxk<gvj> {
   public static final gau a = gau.scaling(0.5F);
   private final gal[] b = new gal[8];
   private final gal c;

   public fzm(gal $$0) {
      this.c = $$0;
      Arrays.setAll(this.b, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gap $$2 = new gap(0.02F);
      int $$3 = -16;
      $$1.a("body", gaq.c().a(0, 0).a(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, $$2), gan.a(0.0F, 8.0F, 0.0F));
      int $$4 = 8;
      gaq $$5 = gaq.c().a(48, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);

      for (int $$6 = 0; $$6 < 8; $$6++) {
         double $$7 = (double)$$6 * Math.PI * 2.0 / 8.0;
         float $$8 = (float)Math.cos($$7) * 5.0F;
         float $$9 = 15.0F;
         float $$10 = (float)Math.sin($$7) * 5.0F;
         $$7 = (double)$$6 * Math.PI * -2.0 / 8.0 + (Math.PI / 2);
         float $$11 = (float)$$7;
         $$1.a(a($$6), $$5, gan.a($$8, 15.0F, $$10, 0.0F, $$11, 0.0F));
      }

      return gar.a($$0, 64, 32);
   }

   public void a(gvj $$0) {
      float $$1 = $$0.a;

      for (gal $$2 : this.b) {
         $$2.e = $$1;
      }
   }

   @Override
   public gal a() {
      return this.c;
   }
}
