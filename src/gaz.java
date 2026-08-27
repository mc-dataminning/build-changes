public class gaz extends fzq<chl> {
   private final ftz f;

   public gaz(fyl.a $$0) {
      super($$0, fmu.bD);
      this.f = $$0.c();
   }

   protected void a(chl $$0, float $$1, djg $$2, epz $$3, ftf $$4, int $$5) {
      int $$6 = $$0.D();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = aun.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(ftz $$0, djg $$1, epz $$2, ftf $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gec.a(gec.a(1.0F), 10);
      } else {
         $$6 = gec.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
