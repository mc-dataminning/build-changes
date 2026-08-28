public class giu implements gig.a {
   private final fgi a;

   public giu(fgi $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fbc $$0, get $$1, double $$2, double $$3, double $$4) {
      jd $$5 = this.a.s.dq();
      dcx $$6 = this.a.s.dQ();

      for (jd $$7 : jd.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         eoy $$8 = $$6.b_($$7);
         if ($$8.a(awj.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            gig.a(
               $$0,
               $$1,
               new ewr(
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

      for (jd $$10 : jd.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         eoy $$11 = $$6.b_($$10);
         if ($$11.a(awj.a)) {
            gig.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
