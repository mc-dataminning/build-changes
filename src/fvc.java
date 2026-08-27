public class fvc extends ftt<cdq> {
   private final foe f;

   public fvc(fso.a $$0) {
      super($$0, fhm.bA);
      this.f = $$0.c();
   }

   protected void a(cdq $$0, float $$1, dfa $$2, elg $$3, fnl $$4, int $$5) {
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

   public static void a(foe $$0, dfa $$1, elg $$2, fnl $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = fyc.a(fyc.a(1.0F), 10);
      } else {
         $$6 = fyc.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
