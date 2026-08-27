public class fvr extends fui<ced> {
   private final fou f;

   public fvr(ftd.a $$0) {
      super($$0, fhw.bA);
      this.f = $$0.c();
   }

   protected void a(ced $$0, float $$1, dfd $$2, elj $$3, foa $$4, int $$5) {
      int $$6 = $$0.H();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = asb.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(fou $$0, dfd $$1, elj $$2, foa $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = fyr.a(fyr.a(1.0F), 10);
      } else {
         $$6 = fyr.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
