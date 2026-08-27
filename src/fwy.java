public class fwy implements fwk.a {
   private final eva a;

   public fwy(eva $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ept $$0, fsz $$1, double $$2, double $$3, double $$4) {
      hx $$5 = this.a.s.dm();
      ctl $$6 = this.a.s.dM();

      for (hx $$7 : hx.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         eek $$8 = $$6.b_($$7);
         if ($$8.a(asg.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            fwk.a(
               $$0,
               $$1,
               new elh(
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

      for (hx $$10 : hx.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         eek $$11 = $$6.b_($$10);
         if ($$11.a(asg.a)) {
            fwk.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
