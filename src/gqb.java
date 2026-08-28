import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class gqb implements gpw.a {
   private final flh a;
   private static final int b = 10;

   public gqb(flh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ffs $$0, glv $$1, double $$2, double $$3, double $$4) {
      dgg $$5 = this.a.s;
      ji $$6 = ji.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (ji $$8 : ji.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dgp.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = ayy.g($$10, 0.9F, 0.9F);
         long $$12 = kk.e($$8.a());
         if ($$7.add($$12)) {
            gpw.a(
               $$0,
               $$1,
               $$5.S().p().a(dgp.a, kk.a($$12)),
               (double)kk.a(kk.b($$12), 8),
               (double)kk.a(kk.c($$12), 8),
               (double)kk.a(kk.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            gpw.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
