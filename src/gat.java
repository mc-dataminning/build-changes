public class gat extends fzk<chf> {
   private final ftt f;

   public gat(fyf.a $$0) {
      super($$0, fmo.bD);
      this.f = $$0.c();
   }

   protected void a(chf $$0, float $$1, dja $$2, ept $$3, fsz $$4, int $$5) {
      int $$6 = $$0.D();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = aui.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(ftt $$0, dja $$1, ept $$2, fsz $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gdw.a(gdw.a(1.0F), 10);
      } else {
         $$6 = gdw.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
