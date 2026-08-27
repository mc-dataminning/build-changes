public class gdo extends gcf<cjq> {
   private final fwn f;

   public gdo(gba.a $$0) {
      super($$0, fpi.bC);
      this.f = $$0.c();
   }

   protected void a(cjq $$0, float $$1, dlj $$2, esh $$3, fvt $$4, int $$5) {
      int $$6 = $$0.D();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = awi.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(fwn $$0, dlj $$1, esh $$2, fvt $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = ggs.a(ggs.a(1.0F), 10);
      } else {
         $$6 = ggs.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
