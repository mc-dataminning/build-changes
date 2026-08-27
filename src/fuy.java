import java.util.Arrays;

public class fuy<T extends bru> extends ftf<T> {
   private final fvw[] a = new fvw[8];
   private final fvw b;

   public fuy(fvw $$0) {
      this.b = $$0;
      Arrays.setAll(this.a, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static fwc b() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      fwa $$2 = new fwa(0.02F);
      int $$3 = -16;
      $$1.a("body", fwb.c().a(0, 0).a(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, $$2), fvy.a(0.0F, 8.0F, 0.0F));
      int $$4 = 8;
      fwb $$5 = fwb.c().a(48, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);

      for (int $$6 = 0; $$6 < 8; $$6++) {
         double $$7 = (double)$$6 * Math.PI * 2.0 / 8.0;
         float $$8 = (float)Math.cos($$7) * 5.0F;
         float $$9 = 15.0F;
         float $$10 = (float)Math.sin($$7) * 5.0F;
         $$7 = (double)$$6 * Math.PI * -2.0 / 8.0 + (Math.PI / 2);
         float $$11 = (float)$$7;
         $$1.a(a($$6), $$5, fvy.a($$8, 15.0F, $$10, 0.0F, $$11, 0.0F));
      }

      return fwc.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      for (fvw $$6 : this.a) {
         $$6.e = $$3;
      }
   }

   @Override
   public fvw a() {
      return this.b;
   }
}
