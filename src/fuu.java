public class fuu<T extends bsh> extends fuz<T> {
   private final fxq a;
   private final fxq[] b = new fxq[9];

   public fuu(fxq $$0) {
      this.a = $$0;

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         this.b[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static fxw b() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      $$1.a("body", fxv.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fxs.a(0.0F, 17.6F, 0.0F));
      ayo $$2 = ayo.a(1660L);

      for (int $$3 = 0; $$3 < 9; $$3++) {
         float $$4 = (((float)($$3 % 3) - (float)($$3 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float $$5 = ((float)($$3 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int $$6 = $$2.a(7) + 8;
         $$1.a(a($$3), fxv.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, (float)$$6, 2.0F), fxs.a($$4, 24.6F, $$5));
      }

      return fxw.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      for (int $$6 = 0; $$6 < this.b.length; $$6++) {
         this.b[$$6].e = 0.2F * ayg.a($$3 * 0.3F + (float)$$6) + 0.4F;
      }
   }

   @Override
   public fxq a() {
      return this.a;
   }
}
