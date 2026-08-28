public class hba extends gxb<cva, hfv> {
   private final gtf g;

   public hba(gyk.a $$0) {
      super($$0, glf.dA);
      this.g = $$0.d();
   }

   protected void a(hfv $$0, ebg $$1, flq $$2, gsc $$3, int $$4) {
      float $$5 = $$0.n;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = azq.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.g, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(gtf $$0, ebg $$1, flq $$2, gsc $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = hks.a(hks.a(1.0F), 10);
      } else {
         $$6 = hks.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public hfv a() {
      return new hfv();
   }

   public void a(cva $$0, hfv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.n = $$0.q() > -1 ? (float)$$0.q() - $$2 + 1.0F : -1.0F;
   }
}
