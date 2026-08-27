public class gni extends gly<coi> {
   private final gga b;

   public gni(gkq.a $$0) {
      super($$0, fyr.bM);
      this.b = $$0.c();
   }

   protected void a(coi $$0, float $$1, dtc $$2, fbc $$3, gfg $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = aym.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.b, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(gga $$0, dtc $$1, fbc $$2, gfg $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gqp.a(gqp.a(1.0F), 10);
      } else {
         $$6 = gqp.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
