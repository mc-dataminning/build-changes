import java.util.Arrays;

public class ghu extends gfq<hee> {
   public static final gjd a = gjd.scaling(0.5F);
   private final giu[] b = new giu[8];

   public ghu(giu $$0) {
      super($$0);
      Arrays.setAll(this.b, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      giy $$2 = new giy(0.02F);
      int $$3 = -16;
      $$1.a("body", giz.c().a(0, 0).a(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, $$2), giw.a(0.0F, 8.0F, 0.0F));
      int $$4 = 8;
      giz $$5 = giz.c().a(48, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);

      for (int $$6 = 0; $$6 < 8; $$6++) {
         double $$7 = (double)$$6 * Math.PI * 2.0 / 8.0;
         float $$8 = (float)Math.cos($$7) * 5.0F;
         float $$9 = 15.0F;
         float $$10 = (float)Math.sin($$7) * 5.0F;
         $$7 = (double)$$6 * Math.PI * -2.0 / 8.0 + (Math.PI / 2);
         float $$11 = (float)$$7;
         $$1.a(a($$6), $$5, giw.a($$8, 15.0F, $$10, 0.0F, $$11, 0.0F));
      }

      return gja.a($$0, 64, 32);
   }

   public void a(hee $$0) {
      super.a($$0);

      for (giu $$1 : this.b) {
         $$1.e = $$0.a;
      }
   }
}
