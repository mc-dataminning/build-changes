import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ghe implements ggz.a {
   private final ffe a;
   private static final int b = 10;

   public ghe(ffe $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ezx $$0, gdn $$1, double $$2, double $$3, double $$4) {
      dbx $$5 = this.a.r;
      iz $$6 = iz.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (iz $$8 : iz.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dcg.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = ayy.h($$10, 0.9F, 0.9F);
         long $$12 = kb.e($$8.a());
         if ($$7.add($$12)) {
            ggz.a(
               $$0,
               $$1,
               $$5.N().p().a(dcg.a, kb.a($$12)),
               (double)kb.a(kb.b($$12), 8),
               (double)kb.a(kb.c($$12), 8),
               (double)kb.a(kb.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            ggz.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
