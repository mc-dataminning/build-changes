public class gac extends fyt<cgv> {
   private final ftc f;

   public gac(fxo.a $$0) {
      super($$0, flx.bD);
      this.f = $$0.c();
   }

   protected void a(cgv $$0, float $$1, dip $$2, epd $$3, fsi $$4, int $$5) {
      int $$6 = $$0.D();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = aty.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(ftc $$0, dip $$1, epd $$2, fsi $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gdf.a(gdf.a(1.0F), 10);
      } else {
         $$6 = gdf.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
