public class gqz extends gnc<cqx, gvp> {
   private final gjk b;

   public gqz(gok.a $$0) {
      super($$0, gbl.cI);
      this.b = $$0.d();
   }

   protected void a(gvp $$0, dvj $$1, feb $$2, gih $$3, int $$4) {
      float $$5 = $$0.C;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = azk.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.b, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(gjk $$0, dvj $$1, feb $$2, gih $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gxu.a(gxu.a(1.0F), 10);
      } else {
         $$6 = gxu.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public gvp a() {
      return new gvp();
   }

   public void a(cqx $$0, gvp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.C = $$0.F() > -1 ? (float)$$0.F() - $$2 + 1.0F : -1.0F;
   }
}
