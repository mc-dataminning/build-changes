public class guu extends gqv<crk, gzo> {
   private final gnc b;

   public guu(gse.a $$0) {
      super($$0, gfc.di);
      this.b = $$0.d();
   }

   protected void a(gzo $$0, dwx $$1, ffu $$2, gly $$3, int $$4) {
      float $$5 = $$0.n;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = ayz.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.b, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(gnc $$0, dwx $$1, ffu $$2, gly $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = hei.a(hei.a(1.0F), 10);
      } else {
         $$6 = hei.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public gzo a() {
      return new gzo();
   }

   public void a(crk $$0, gzo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.n = $$0.x() > -1 ? (float)$$0.x() - $$2 + 1.0F : -1.0F;
   }
}
