public class gue extends gqf<csj, gyv> {
   private final gmm b;

   public gue(gro.a $$0) {
      super($$0, gel.dd);
      this.b = $$0.d();
   }

   protected void a(gyv $$0, dxu $$1, fgq $$2, glj $$3, int $$4) {
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

   public static void a(gmm $$0, dxu $$1, fgq $$2, glj $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = hba.a(hba.a(1.0F), 10);
      } else {
         $$6 = hba.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public gyv a() {
      return new gyv();
   }

   public void a(csj $$0, gyv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.C = $$0.x() > -1 ? (float)$$0.x() - $$2 + 1.0F : -1.0F;
   }
}
