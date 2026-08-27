public class fxe implements fwq.a {
   private final evg a;

   public fxe(evg $$0) {
      this.a = $$0;
   }

   @Override
   public void a(epz $$0, ftf $$1, double $$2, double $$3, double $$4) {
      hx $$5 = this.a.s.dm();
      ctr $$6 = this.a.s.dM();

      for (hx $$7 : hx.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         eeq $$8 = $$6.b_($$7);
         if ($$8.a(asl.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            fwq.a(
               $$0,
               $$1,
               new eln(
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
         eeq $$11 = $$6.b_($$10);
         if ($$11.a(asl.a)) {
            fwq.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
