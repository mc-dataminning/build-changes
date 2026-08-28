public class hal extends gwm<cvj, hfi> {
   private final gsq g;

   public hal(gxv.a $$0) {
      super($$0, gkq.dA);
      this.g = $$0.d();
   }

   protected void a(hfi $$0, ebq $$1, fld $$2, grn $$3, int $$4) {
      float $$5 = $$0.n;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = azz.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.g, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(gsq $$0, ebq $$1, fld $$2, grn $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = hkg.a(hkg.a(1.0F), 10);
      } else {
         $$6 = hkg.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public hfi a() {
      return new hfi();
   }

   public void a(cvj $$0, hfi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.n = $$0.q() > -1 ? (float)$$0.q() - $$2 + 1.0F : -1.0F;
   }
}
