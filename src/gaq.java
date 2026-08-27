public class gaq implements gac.a {
   private final eyk a;

   public gaq(eyk $$0) {
      this.a = $$0;
   }

   @Override
   public void a(etd $$0, fwq $$1, double $$2, double $$3, double $$4) {
      ib $$5 = this.a.s.dj();
      cwh $$6 = this.a.s.dJ();

      for (ib $$7 : ib.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         ehr $$8 = $$6.b_($$7);
         if ($$8.a(auj.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            gac.a(
               $$0,
               $$1,
               new eoq(
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

      for (ib $$10 : ib.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         ehr $$11 = $$6.b_($$10);
         if ($$11.a(auj.a)) {
            gac.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
