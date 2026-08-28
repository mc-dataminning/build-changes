public class glo extends gke<cph> {
   private final gek f;

   public glo(giz.a $$0) {
      super($$0, fxb.bG);
      this.f = $$0.c();
   }

   protected void a(cph $$0, float $$1, dse $$2, faa $$3, gdq $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = ayz.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(gek $$0, dse $$1, faa $$2, gdq $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gos.a(gos.a(1.0F), 10);
      } else {
         $$6 = gos.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
