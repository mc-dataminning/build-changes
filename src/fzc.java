import java.util.Arrays;

public class fzc extends fxa<gus> {
   public static final gak a = gak.scaling(0.5F);
   private final gab[] b = new gab[8];
   private final gab c;

   public fzc(gab $$0) {
      this.c = $$0;
      Arrays.setAll(this.b, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gaf $$2 = new gaf(0.02F);
      int $$3 = -16;
      $$1.a("body", gag.c().a(0, 0).a(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, $$2), gad.a(0.0F, 8.0F, 0.0F));
      int $$4 = 8;
      gag $$5 = gag.c().a(48, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);

      for (int $$6 = 0; $$6 < 8; $$6++) {
         double $$7 = (double)$$6 * Math.PI * 2.0 / 8.0;
         float $$8 = (float)Math.cos($$7) * 5.0F;
         float $$9 = 15.0F;
         float $$10 = (float)Math.sin($$7) * 5.0F;
         $$7 = (double)$$6 * Math.PI * -2.0 / 8.0 + (Math.PI / 2);
         float $$11 = (float)$$7;
         $$1.a(a($$6), $$5, gad.a($$8, 15.0F, $$10, 0.0F, $$11, 0.0F));
      }

      return gah.a($$0, 64, 32);
   }

   public void a(gus $$0) {
      float $$1 = $$0.a;

      for (gab $$2 : this.b) {
         $$2.e = $$1;
      }
   }

   @Override
   public gab a() {
      return this.c;
   }
}
