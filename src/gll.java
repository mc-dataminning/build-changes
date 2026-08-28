public class gll extends gkb<cpe> {
   private final geh f;

   public gll(giw.a $$0) {
      super($$0, fwy.bG);
      this.f = $$0.c();
   }

   protected void a(cpe $$0, float $$1, dsb $$2, ezx $$3, gdn $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = ayy.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(geh $$0, dsb $$1, ezx $$2, gdn $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gop.a(gop.a(1.0F), 10);
      } else {
         $$6 = gop.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
