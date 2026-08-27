import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class fui implements fud.a {
   private final etd a;
   private static final int b = 10;

   public fui(etd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(enw $$0, fqu $$1, double $$2, double $$3, double $$4) {
      csa $$5 = this.a.r;
      ht $$6 = ht.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (ht $$8 : ht.a($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(csj.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = atm.h($$10, 0.9F, 0.9F);
         long $$12 = iu.e($$8.a());
         if ($$7.add($$12)) {
            fud.a(
               $$0,
               $$1,
               $$5.K().p().a(csj.a, iu.a($$12)),
               (double)iu.a(iu.b($$12), 8),
               (double)iu.a(iu.c($$12), 8),
               (double)iu.a(iu.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            fud.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
