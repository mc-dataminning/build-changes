import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class gev implements geq.a {
   private final fcu a;
   private static final int b = 10;

   public gev(fcu $$0) {
      this.a = $$0;
   }

   @Override
   public void a(exn $$0, gbe $$1, double $$2, double $$3, double $$4) {
      czu $$5 = this.a.r;
      im $$6 = im.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (im $$8 : im.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dad.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = axw.h($$10, 0.9F, 0.9F);
         long $$12 = jo.e($$8.a());
         if ($$7.add($$12)) {
            geq.a(
               $$0,
               $$1,
               $$5.M().p().a(dad.a, jo.a($$12)),
               (double)jo.a(jo.b($$12), 8),
               (double)jo.a(jo.c($$12), 8),
               (double)jo.a(jo.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            geq.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
