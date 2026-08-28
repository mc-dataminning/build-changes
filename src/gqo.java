public class gqo extends gmr<cqs, gve> {
   private final giz b;

   public gqo(gnz.a $$0) {
      super($$0, gba.cI);
      this.b = $$0.d();
   }

   protected void a(gve $$0, dvd $$1, fdt $$2, ghw $$3, int $$4) {
      float $$5 = $$0.C;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = azj.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.b, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(giz $$0, dvd $$1, fdt $$2, ghw $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gxj.a(gxj.a(1.0F), 10);
      } else {
         $$6 = gxj.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public gve a() {
      return new gve();
   }

   public void a(cqs $$0, gve $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.C = $$0.F() > -1 ? (float)$$0.F() - $$2 + 1.0F : -1.0F;
   }
}
