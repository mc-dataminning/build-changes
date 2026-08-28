import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class gmb implements glw.a {
   private final fja a;
   private static final int b = 10;

   public gmb(fja $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fdt $$0, ghw $$1, double $$2, double $$3, double $$4) {
      dev $$5 = this.a.s;
      jg $$6 = jg.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (jg $$8 : jg.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dfe.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = azj.g($$10, 0.9F, 0.9F);
         long $$12 = ki.e($$8.a());
         if ($$7.add($$12)) {
            glw.a(
               $$0,
               $$1,
               $$5.P().p().a(dfe.a, ki.a($$12)),
               (double)ki.a(ki.b($$12), 8),
               (double)ki.a(ki.c($$12), 8),
               (double)ki.a(ki.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            glw.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
