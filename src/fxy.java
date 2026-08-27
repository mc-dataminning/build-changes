public class fxy extends fwp<cfp> {
   private final frb f;

   public fxy(fvk.a $$0) {
      super($$0, fka.bA);
      this.f = $$0.c();
   }

   protected void a(cfp $$0, float $$1, dgw $$2, enk $$3, fqh $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = ati.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(frb $$0, dgw $$1, enk $$2, fqh $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gay.a(gay.a(1.0F), 10);
      } else {
         $$6 = gay.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
