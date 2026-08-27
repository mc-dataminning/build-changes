import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class fzb implements fyw.a {
   private final exh a;
   private static final int b = 10;

   public fzb(exh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(esa $$0, fvl $$1, double $$2, double $$3, double $$4) {
      cvn $$5 = this.a.r;
      hz $$6 = hz.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (hz $$8 : hz.a($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(cvw.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = awh.h($$10, 0.9F, 0.9F);
         long $$12 = jb.e($$8.a());
         if ($$7.add($$12)) {
            fyw.a(
               $$0,
               $$1,
               $$5.L().p().a(cvw.a, jb.a($$12)),
               (double)jb.a(jb.b($$12), 8),
               (double)jb.a(jb.c($$12), 8),
               (double)jb.a(jb.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            fyw.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
