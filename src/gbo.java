public class gbo extends gaf<chu> {
   private final fun f;

   public gbo(fza.a $$0) {
      super($$0, fni.bC);
      this.f = $$0.c();
   }

   protected void a(chu $$0, float $$1, djp $$2, eqk $$3, ftt $$4, int $$5) {
      int $$6 = $$0.D();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = aup.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(fun $$0, djp $$1, eqk $$2, ftt $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = ges.a(ges.a(1.0F), 10);
      } else {
         $$6 = ges.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
