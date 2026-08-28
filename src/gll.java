import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class gll implements glg.a {
   private final fil a;
   private static final int b = 10;

   public gll(fil $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fde $$0, ghg $$1, double $$2, double $$3, double $$4) {
      deg $$5 = this.a.s;
      je $$6 = je.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (je $$8 : je.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dep.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = azd.g($$10, 0.9F, 0.9F);
         long $$12 = kg.e($$8.a());
         if ($$7.add($$12)) {
            glg.a(
               $$0,
               $$1,
               $$5.P().p().a(dep.a, kg.a($$12)),
               (double)kg.a(kg.b($$12), 8),
               (double)kg.a(kg.c($$12), 8),
               (double)kg.a(kg.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            glg.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
