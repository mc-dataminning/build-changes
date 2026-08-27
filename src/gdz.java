public class gdz implements gdl.a {
   private final fbp a;

   public gdz(fbp $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ewi $$0, fzz $$1, double $$2, double $$3, double $$4) {
      ib $$5 = this.a.s.dm();
      cza $$6 = this.a.s.dM();

      for (ib $$7 : ib.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         eks $$8 = $$6.b_($$7);
         if ($$8.a(avh.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            gdl.a(
               $$0,
               $$1,
               new erv(
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
         eks $$11 = $$6.b_($$10);
         if ($$11.a(avh.a)) {
            gdl.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
