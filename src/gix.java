import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class gix implements gis.a {
   private final fgj a;
   private static final int b = 10;

   public gix(fgj $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fbc $$0, gfg $$1, double $$2, double $$3, double $$4) {
      dca $$5 = this.a.r;
      ir $$6 = ir.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (ir $$8 : ir.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dcj.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = aym.h($$10, 0.9F, 0.9F);
         long $$12 = jt.e($$8.a());
         if ($$7.add($$12)) {
            gis.a(
               $$0,
               $$1,
               $$5.N().p().a(dcj.a, jt.a($$12)),
               (double)jt.a(jt.b($$12), 8),
               (double)jt.a(jt.c($$12), 8),
               (double)jt.a(jt.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            gis.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
