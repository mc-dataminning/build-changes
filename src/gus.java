public class gus extends gqt<crk, gzm> {
   private final gnb b;

   public gus(gsc.a $$0) {
      super($$0, gfb.di);
      this.b = $$0.d();
   }

   protected void a(gzm $$0, dwx $$1, ffu $$2, glx $$3, int $$4) {
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

   public static void a(gnb $$0, dwx $$1, ffu $$2, glx $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = hea.a(hea.a(1.0F), 10);
      } else {
         $$6 = hea.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public gzm a() {
      return new gzm();
   }

   public void a(crk $$0, gzm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.n = $$0.x() > -1 ? (float)$$0.x() - $$2 + 1.0F : -1.0F;
   }
}
