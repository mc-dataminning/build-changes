import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class fvy implements fvt.a {
   private final euk a;
   private static final int b = 10;

   public fvy(euk $$0) {
      this.a = $$0;
   }

   @Override
   public void a(epd $$0, fsi $$1, double $$2, double $$3, double $$4) {
      csy $$5 = this.a.r;
      hv $$6 = hv.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (hv $$8 : hv.a($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(cth.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = aty.h($$10, 0.9F, 0.9F);
         long $$12 = ix.e($$8.a());
         if ($$7.add($$12)) {
            fvt.a(
               $$0,
               $$1,
               $$5.K().p().a(cth.a, ix.a($$12)),
               (double)ix.a(ix.b($$12), 8),
               (double)ix.a(ix.c($$12), 8),
               (double)ix.a(ix.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            fvt.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
