public class gmy extends glo<cpf> {
   private final gft g;

   public gmy(gkj.a $$0) {
      super($$0, fyj.bH);
      this.g = $$0.c();
   }

   protected void a(cpf $$0, float $$1, dtc $$2, fbi $$3, gez $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = ayo.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.g, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(gft $$0, dtc $$1, fbi $$2, gez $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gqc.a(gqc.a(1.0F), 10);
      } else {
         $$6 = gqc.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
