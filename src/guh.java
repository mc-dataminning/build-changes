import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class guh implements guc.a {
   private final foz a;
   private static final int b = 10;

   public guh(foz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fjj $$0, gqa $$1, double $$2, double $$3, double $$4) {
      dja $$5 = this.a.s;
      iu $$6 = iu.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (iu $$8 : iu.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(djj.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = azm.g($$10, 0.9F, 0.9F);
         long $$12 = jx.e($$8.a());
         if ($$7.add($$12)) {
            guc.a(
               $$0,
               $$1,
               $$5.S().q().a(djj.a, jx.a($$12)),
               (double)jx.a(jx.b($$12), 8),
               (double)jx.a(jx.c($$12), 8),
               (double)jx.a(jx.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            guc.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
