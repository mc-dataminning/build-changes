import java.util.Arrays;

public class fwb<T extends bst> extends fui<T> {
   private final fwz[] a = new fwz[8];
   private final fwz b;

   public fwb(fwz $$0) {
      this.b = $$0;
      Arrays.setAll(this.a, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static fxf b() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      fxd $$2 = new fxd(0.02F);
      int $$3 = -16;
      $$1.a("body", fxe.c().a(0, 0).a(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, $$2), fxb.a(0.0F, 8.0F, 0.0F));
      int $$4 = 8;
      fxe $$5 = fxe.c().a(48, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);

      for (int $$6 = 0; $$6 < 8; $$6++) {
         double $$7 = (double)$$6 * Math.PI * 2.0 / 8.0;
         float $$8 = (float)Math.cos($$7) * 5.0F;
         float $$9 = 15.0F;
         float $$10 = (float)Math.sin($$7) * 5.0F;
         $$7 = (double)$$6 * Math.PI * -2.0 / 8.0 + (Math.PI / 2);
         float $$11 = (float)$$7;
         $$1.a(a($$6), $$5, fxb.a($$8, 15.0F, $$10, 0.0F, $$11, 0.0F));
      }

      return fxf.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      for (fwz $$6 : this.a) {
         $$6.e = $$3;
      }
   }

   @Override
   public fwz a() {
      return this.b;
   }
}
