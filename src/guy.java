import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class guy implements gut.a {
   private final fpt a;
   private static final int b = 10;

   public guy(fpt $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fkd $$0, gqr $$1, double $$2, double $$3, double $$4) {
      djm $$5 = this.a.s;
      iv $$6 = iv.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (iv $$8 : iv.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(djv.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = azm.g($$10, 0.9F, 0.9F);
         long $$12 = jy.e($$8.a());
         if ($$7.add($$12)) {
            gut.a(
               $$0,
               $$1,
               $$5.S().q().a(djv.a, jy.a($$12)),
               (double)jy.a(jy.b($$12), 8),
               (double)jy.a(jy.c($$12), 8),
               (double)jy.a(jy.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            gut.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
