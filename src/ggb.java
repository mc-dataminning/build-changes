import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ggb implements gfw.a {
   private final feb a;
   private static final int b = 10;

   public ggb(feb $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eyu $$0, gck $$1, double $$2, double $$3, double $$4) {
      daz $$5 = this.a.r;
      io $$6 = io.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (io $$8 : io.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dbi.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = ayf.h($$10, 0.9F, 0.9F);
         long $$12 = jq.e($$8.a());
         if ($$7.add($$12)) {
            gfw.a(
               $$0,
               $$1,
               $$5.M().p().a(dbi.a, jq.a($$12)),
               (double)jq.a(jq.b($$12), 8),
               (double)jq.a(jq.c($$12), 8),
               (double)jq.a(jq.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            gfw.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
