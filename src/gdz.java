import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class gdz implements gdu.a {
   private final fby a;
   private static final int b = 10;

   public gdz(fby $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ewr $$0, gai $$1, double $$2, double $$3, double $$4) {
      czg $$5 = this.a.r;
      id $$6 = id.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (id $$8 : id.a($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(czp.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = axm.h($$10, 0.9F, 0.9F);
         long $$12 = jg.e($$8.a());
         if ($$7.add($$12)) {
            gdu.a(
               $$0,
               $$1,
               $$5.M().p().a(czp.a, jg.a($$12)),
               (double)jg.a(jg.b($$12), 8),
               (double)jg.a(jg.c($$12), 8),
               (double)jg.a(jg.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            gdu.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
