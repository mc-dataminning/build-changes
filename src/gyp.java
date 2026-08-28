public class gyp extends guq<cty, hdj> {
   private final gqw g;

   public gyp(gvz.a $$0) {
      super($$0, git.dw);
      this.g = $$0.d();
   }

   protected void a(hdj $$0, dzz $$1, fjc $$2, gps $$3, int $$4) {
      float $$5 = $$0.n;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = azm.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.g, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(gqw $$0, dzz $$1, fjc $$2, gps $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = hif.a(hif.a(1.0F), 10);
      } else {
         $$6 = hif.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public hdj a() {
      return new hdj();
   }

   public void a(cty $$0, hdj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.n = $$0.q() > -1 ? (float)$$0.q() - $$2 + 1.0F : -1.0F;
   }
}
