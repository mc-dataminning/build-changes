public class fyq extends fxh<cgc> {
   private final frt f;

   public fyq(fwc.a $$0) {
      super($$0, fks.bA);
      this.f = $$0.c();
   }

   protected void a(cgc $$0, float $$1, dhn $$2, eob $$3, fqz $$4, int $$5) {
      int $$6 = $$0.D();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = atq.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(frt $$0, dhn $$1, eob $$2, fqz $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gbq.a(gbq.a(1.0F), 10);
      } else {
         $$6 = gbq.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
