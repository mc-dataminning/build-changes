import java.util.Arrays;

public class fwk<T extends bsd> extends fur<T> {
   private final fxi[] a = new fxi[8];
   private final fxi b;

   public fwk(fxi $$0) {
      this.b = $$0;
      Arrays.setAll(this.a, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static fxo b() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      fxm $$2 = new fxm(0.02F);
      int $$3 = -16;
      $$1.a("body", fxn.c().a(0, 0).a(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, $$2), fxk.a(0.0F, 8.0F, 0.0F));
      int $$4 = 8;
      fxn $$5 = fxn.c().a(48, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);

      for (int $$6 = 0; $$6 < 8; $$6++) {
         double $$7 = (double)$$6 * Math.PI * 2.0 / 8.0;
         float $$8 = (float)Math.cos($$7) * 5.0F;
         float $$9 = 15.0F;
         float $$10 = (float)Math.sin($$7) * 5.0F;
         $$7 = (double)$$6 * Math.PI * -2.0 / 8.0 + (Math.PI / 2);
         float $$11 = (float)$$7;
         $$1.a(a($$6), $$5, fxk.a($$8, 15.0F, $$10, 0.0F, $$11, 0.0F));
      }

      return fxo.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      for (fxi $$6 : this.a) {
         $$6.e = $$3;
      }
   }

   @Override
   public fxi a() {
      return this.b;
   }
}
