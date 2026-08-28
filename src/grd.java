import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class grd implements gqy.a {
   private final fmg a;
   private static final int b = 10;

   public grd(fmg $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fgr $$0, gmx $$1, double $$2, double $$3, double $$4) {
      dgz $$5 = this.a.s;
      ji $$6 = ji.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (ji $$8 : ji.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dhi.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = ayz.g($$10, 0.9F, 0.9F);
         long $$12 = kk.e($$8.a());
         if ($$7.add($$12)) {
            gqy.a(
               $$0,
               $$1,
               $$5.S().q().a(dhi.a, kk.a($$12)),
               (double)kk.a(kk.b($$12), 8),
               (double)kk.a(kk.c($$12), 8),
               (double)kk.a(kk.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            gqy.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
