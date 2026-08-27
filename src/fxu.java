import java.util.Arrays;

public class fxu<T extends brv> extends fvz<T> {
   private final fys[] a = new fys[8];
   private final fys b;

   public fxu(fys $$0) {
      this.b = $$0;
      Arrays.setAll(this.a, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static fyy b() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      fyw $$2 = new fyw(0.02F);
      int $$3 = -16;
      $$1.a("body", fyx.c().a(0, 0).a(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, $$2), fyu.a(0.0F, 8.0F, 0.0F));
      int $$4 = 8;
      fyx $$5 = fyx.c().a(48, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);

      for (int $$6 = 0; $$6 < 8; $$6++) {
         double $$7 = (double)$$6 * Math.PI * 2.0 / 8.0;
         float $$8 = (float)Math.cos($$7) * 5.0F;
         float $$9 = 15.0F;
         float $$10 = (float)Math.sin($$7) * 5.0F;
         $$7 = (double)$$6 * Math.PI * -2.0 / 8.0 + (Math.PI / 2);
         float $$11 = (float)$$7;
         $$1.a(a($$6), $$5, fyu.a($$8, 15.0F, $$10, 0.0F, $$11, 0.0F));
      }

      return fyy.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      for (fys $$6 : this.a) {
         $$6.e = $$3;
      }
   }

   @Override
   public fys a() {
      return this.b;
   }
}
