public class gtz extends gqa<csf, gyq> {
   private final gmh b;

   public gtz(grj.a $$0) {
      super($$0, geg.dd);
      this.b = $$0.d();
   }

   protected void a(gyq $$0, dxn $$1, fgl $$2, gle $$3, int $$4) {
      float $$5 = $$0.C;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = bae.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.b, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(gmh $$0, dxn $$1, fgl $$2, gle $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = hav.a(hav.a(1.0F), 10);
      } else {
         $$6 = hav.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public gyq a() {
      return new gyq();
   }

   public void a(csf $$0, gyq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.C = $$0.x() > -1 ? (float)$$0.x() - $$2 + 1.0F : -1.0F;
   }
}
