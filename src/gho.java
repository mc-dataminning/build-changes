import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class gho implements ghj.a {
   private final ffn a;
   private static final int b = 10;

   public gho(ffn $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fag $$0, gdx $$1, double $$2, double $$3, double $$4) {
      dcd $$5 = this.a.r;
      ja $$6 = ja.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (ja $$8 : ja.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dcm.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = aye.h($$10, 0.9F, 0.9F);
         long $$12 = kc.e($$8.a());
         if ($$7.add($$12)) {
            ghj.a(
               $$0,
               $$1,
               $$5.N().p().a(dcm.a, kc.a($$12)),
               (double)kc.a(kc.b($$12), 8),
               (double)kc.a(kc.c($$12), 8),
               (double)kc.a(kc.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            ghj.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
