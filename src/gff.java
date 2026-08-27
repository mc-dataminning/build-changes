import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class gff implements gfa.a {
   private final fde a;
   private static final int b = 10;

   public gff(fde $$0) {
      this.a = $$0;
   }

   @Override
   public void a(exx $$0, gbo $$1, double $$2, double $$3, double $$4) {
      dad $$5 = this.a.r;
      in $$6 = in.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (in $$8 : in.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dam.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = axz.h($$10, 0.9F, 0.9F);
         long $$12 = jp.e($$8.a());
         if ($$7.add($$12)) {
            gfa.a(
               $$0,
               $$1,
               $$5.M().p().a(dam.a, jp.a($$12)),
               (double)jp.a(jp.b($$12), 8),
               (double)jp.a(jp.c($$12), 8),
               (double)jp.a(jp.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            gfa.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
