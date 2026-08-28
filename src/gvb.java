import org.apache.commons.lang3.mutable.MutableInt;

public class gvb {
   private final fpt a;

   public gvb(fpt $$0) {
      this.a = $$0;
   }

   public void a(fkd $$0, guk $$1, gqr $$2, double $$3, double $$4, double $$5) {
      gqs $$6 = this.a.f.w().c();
      MutableInt $$7 = new MutableInt(0);
      $$6.a(($$6x, $$7x, $$8, $$9) -> this.a($$6x, $$0, $$2, $$3, $$4, $$5, $$8, $$7x, $$7, $$9), $$1, 32);
   }

   private void a(gqs.d $$0, fkd $$1, gqr $$2, double $$3, double $$4, double $$5, int $$6, boolean $$7, MutableInt $$8, boolean $$9) {
      fex $$10 = $$0.b();
      double $$11 = $$10.b();
      long $$12 = Math.round($$11 / 16.0);
      if ($$12 == 1L) {
         $$8.add(1);
         double $$13 = $$10.f().d;
         double $$14 = $$10.f().e;
         double $$15 = $$10.f().f;
         int $$16 = $$9 ? -16711936 : -1;
         gut.a($$1, $$2, String.valueOf($$8.getValue()), $$13, $$14, $$15, $$16, 0.3F);
      }

      fkh $$17 = $$2.getBuffer(grc.y());
      long $$18 = $$12 + 5L;
      grk.a($$1, $$17, $$10.h(0.1 * (double)$$6).d(-$$3, -$$4, -$$5), a($$18, 0.3F), a($$18, 0.8F), a($$18, 0.5F), $$7 ? 0.4F : 1.0F);
   }

   private static float a(long $$0, float $$1) {
      float $$2 = 0.1F;
      return azm.i($$1 * (float)$$0) * 0.9F + 0.1F;
   }
}
