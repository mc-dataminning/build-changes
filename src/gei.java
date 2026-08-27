public class gei implements gdu.a {
   private final fby a;

   public gei(fby $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ewr $$0, gai $$1, double $$2, double $$3, double $$4) {
      id $$5 = this.a.s.dm();
      czj $$6 = this.a.s.dM();

      for (id $$7 : id.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         elb $$8 = $$6.b_($$7);
         if ($$8.a(avj.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            gdu.a(
               $$0,
               $$1,
               new ese(
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

      for (id $$10 : id.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         elb $$11 = $$6.b_($$10);
         if ($$11.a(avj.a)) {
            gdu.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
