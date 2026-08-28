import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class glq implements gll.a {
   private final fip a;
   private static final int b = 10;

   public glq(fip $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fdi $$0, ghl $$1, double $$2, double $$3, double $$4) {
      dej $$5 = this.a.s;
      jf $$6 = jf.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (jf $$8 : jf.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(des.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = azf.g($$10, 0.9F, 0.9F);
         long $$12 = kh.e($$8.a());
         if ($$7.add($$12)) {
            gll.a(
               $$0,
               $$1,
               $$5.P().p().a(des.a, kh.a($$12)),
               (double)kh.a(kh.b($$12), 8),
               (double)kh.a(kh.c($$12), 8),
               (double)kh.a(kh.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            gll.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
