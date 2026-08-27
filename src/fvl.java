public class fvl extends fuc<cdp> {
   private final fon f;

   public fvl(fsx.a $$0) {
      super($$0, fhr.bA);
      this.f = $$0.c();
   }

   protected void a(cdp $$0, float $$1, dez $$2, elf $$3, fnu $$4, int $$5) {
      int $$6 = $$0.B();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = arp.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(fon $$0, dez $$1, elf $$2, fnu $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = fyl.a(fyl.a(1.0F), 10);
      } else {
         $$6 = fyl.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
