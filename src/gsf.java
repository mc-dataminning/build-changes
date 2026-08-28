import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class gsf implements gsa.a {
   private final fnd a;
   private static final int b = 10;

   public gsf(fnd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fho $$0, gny $$1, double $$2, double $$3, double $$4) {
      dhp $$5 = this.a.s;
      jj $$6 = jj.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (jj $$8 : jj.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dhy.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = azk.g($$10, 0.9F, 0.9F);
         long $$12 = kl.e($$8.a());
         if ($$7.add($$12)) {
            gsa.a(
               $$0,
               $$1,
               $$5.S().q().a(dhy.a, kl.a($$12)),
               (double)kl.a(kl.b($$12), 8),
               (double)kl.a(kl.c($$12), 8),
               (double)kl.a(kl.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            gsa.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
