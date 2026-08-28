public class ghn implements ggz.a {
   private final ffe a;

   public ghn(ffe $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ezx $$0, gdn $$1, double $$2, double $$3, double $$4) {
      iz $$5 = this.a.s.dp();
      dca $$6 = this.a.s.dP();

      for (iz $$7 : iz.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         enu $$8 = $$6.b_($$7);
         if ($$8.a(awu.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            ggz.a(
               $$0,
               $$1,
               new evl(
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

      for (iz $$10 : iz.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         enu $$11 = $$6.b_($$10);
         if ($$11.a(awu.a)) {
            ggz.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
