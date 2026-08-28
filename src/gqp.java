public class gqp implements gpz.a {
   private final flj a;

   public gqp(flj $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ffu $$0, gly $$1, double $$2, double $$3, double $$4) {
      ji $$5 = this.a.t.dv();
      dgl $$6 = this.a.t.dV();

      for (ji $$7 : ji.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         esz $$8 = $$6.b_($$7);
         if ($$8.a(awv.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            gpz.a(
               $$0,
               $$1,
               new fav(
                     (double)((float)$$7.u() + 0.01F),
                     (double)((float)$$7.v() + 0.01F),
                     (double)((float)$$7.w() + 0.01F),
                     (double)((float)$$7.u() + 0.99F),
                     $$9,
                     (double)((float)$$7.w() + 0.99F)
                  )
                  .d(-$$2, -$$3, -$$4),
               0.0F,
               1.0F,
               0.0F,
               0.15F
            );
         }
      }

      for (ji $$10 : ji.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         esz $$11 = $$6.b_($$10);
         if ($$11.a(awv.a)) {
            gpz.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
