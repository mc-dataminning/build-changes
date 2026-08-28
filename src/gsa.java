public class gsa extends goc<crh, gwq> {
   private final gkj b;

   public gsa(gpk.a $$0) {
      super($$0, gck.da);
      this.b = $$0.d();
   }

   protected void a(gwq $$0, dvv $$1, fer $$2, gjg $$3, int $$4) {
      float $$5 = $$0.C;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = azm.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.b, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(gkj $$0, dvv $$1, fer $$2, gjg $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gyv.a(gyv.a(1.0F), 10);
      } else {
         $$6 = gyv.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public gwq a() {
      return new gwq();
   }

   public void a(crh $$0, gwq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.C = $$0.v() > -1 ? (float)$$0.v() - $$2 + 1.0F : -1.0F;
   }
}
