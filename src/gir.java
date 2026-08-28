import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class gir implements gim.a {
   private final fgo a;
   private static final int b = 10;

   public gir(fgo $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fbi $$0, gez $$1, double $$2, double $$3, double $$4) {
      dcw $$5 = this.a.r;
      jd $$6 = jd.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (jd $$8 : jd.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(ddf.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = ayo.h($$10, 0.9F, 0.9F);
         long $$12 = kf.e($$8.a());
         if ($$7.add($$12)) {
            gim.a(
               $$0,
               $$1,
               $$5.N().p().a(ddf.a, kf.a($$12)),
               (double)kf.a(kf.b($$12), 8),
               (double)kf.a(kf.c($$12), 8),
               (double)kf.a(kf.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            gim.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
