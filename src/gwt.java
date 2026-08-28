public class gwt implements gwd.a {
   private final frd a;

   public gwt(frd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(flo $$0, gsa $$1, double $$2, double $$3, double $$4) {
      iv $$5 = this.a.t.dv();
      dka $$6 = this.a.t.dV();

      for (iv $$7 : iv.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         exo $$8 = $$6.b_($$7);
         if ($$8.a(axj.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            gwd.a(
               $$0,
               $$1,
               new ffl(
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

      for (iv $$10 : iv.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         exo $$11 = $$6.b_($$10);
         if ($$11.a(axj.a)) {
            gwd.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
