import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class gmm implements gmh.a {
   private final fji a;
   private static final int b = 10;

   public gmm(fji $$0) {
      this.a = $$0;
   }

   @Override
   public void a(feb $$0, gih $$1, double $$2, double $$3, double $$4) {
      dfb $$5 = this.a.s;
      jh $$6 = jh.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (jh $$8 : jh.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dfk.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = azk.g($$10, 0.9F, 0.9F);
         long $$12 = kj.e($$8.a());
         if ($$7.add($$12)) {
            gmh.a(
               $$0,
               $$1,
               $$5.P().p().a(dfk.a, kj.a($$12)),
               (double)kj.a(kj.b($$12), 8),
               (double)kj.a(kj.c($$12), 8),
               (double)kj.a(kj.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            gmh.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
