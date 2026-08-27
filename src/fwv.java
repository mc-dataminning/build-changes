import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class fwv implements fwq.a {
   private final evg a;
   private static final int b = 10;

   public fwv(evg $$0) {
      this.a = $$0;
   }

   @Override
   public void a(epz $$0, ftf $$1, double $$2, double $$3, double $$4) {
      cto $$5 = this.a.r;
      hx $$6 = hx.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (hx $$8 : hx.a($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(ctx.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = aun.h($$10, 0.9F, 0.9F);
         long $$12 = iz.e($$8.a());
         if ($$7.add($$12)) {
            fwq.a(
               $$0,
               $$1,
               $$5.L().p().a(ctx.a, iz.a($$12)),
               (double)iz.a(iz.b($$12), 8),
               (double)iz.a(iz.c($$12), 8),
               (double)iz.a(iz.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            fwq.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
