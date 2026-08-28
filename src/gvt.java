public class gvt extends gru<cse, han> {
   private final gob b;

   public gvt(gtd.a $$0) {
      super($$0, ggb.dk);
      this.b = $$0.d();
   }

   protected void a(han $$0, dxq $$1, fgr $$2, gmx $$3, int $$4) {
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

   public static void a(gob $$0, dxq $$1, fgr $$2, gmx $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = hfh.a(hfh.a(1.0F), 10);
      } else {
         $$6 = hfh.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public han a() {
      return new han();
   }

   public void a(cse $$0, han $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.n = $$0.s() > -1 ? (float)$$0.s() - $$2 + 1.0F : -1.0F;
   }
}
