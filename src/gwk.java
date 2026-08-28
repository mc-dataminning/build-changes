import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class gwk implements gwf.a {
   private final frf a;
   private static final int b = 10;

   public gwk(frf $$0) {
      this.a = $$0;
   }

   @Override
   public void a(flq $$0, gsc $$1, double $$2, double $$3, double $$4) {
      djz $$5 = this.a.s;
      iw $$6 = iw.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (iw $$8 : iw.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dki.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = azq.g($$10, 0.9F, 0.9F);
         long $$12 = jz.e($$8.a());
         if ($$7.add($$12)) {
            gwf.a(
               $$0,
               $$1,
               $$5.S().q().a(dki.a, jz.a($$12)),
               (double)jz.a(jz.b($$12), 8),
               (double)jz.a(jz.c($$12), 8),
               (double)jz.a(jz.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            gwf.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
