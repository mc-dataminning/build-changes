import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class gbh implements gbc.a {
   private final ezg a;
   private static final int b = 10;

   public gbh(ezg $$0) {
      this.a = $$0;
   }

   @Override
   public void a(etz $$0, fxq $$1, double $$2, double $$3, double $$4) {
      cwz $$5 = this.a.r;
      ib $$6 = ib.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (ib $$8 : ib.a($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(cxi.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = aww.h($$10, 0.9F, 0.9F);
         long $$12 = je.e($$8.a());
         if ($$7.add($$12)) {
            gbc.a(
               $$0,
               $$1,
               $$5.L().p().a(cxi.a, je.a($$12)),
               (double)je.a(je.b($$12), 8),
               (double)je.a(je.c($$12), 8),
               (double)je.a(je.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            gbc.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
