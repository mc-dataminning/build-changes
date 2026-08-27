public class ggk implements gfw.a {
   private final feb a;

   public ggk(feb $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eyu $$0, gck $$1, double $$2, double $$3, double $$4) {
      io $$5 = this.a.s.dp();
      dbc $$6 = this.a.s.dP();

      for (io $$7 : io.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         emw $$8 = $$6.b_($$7);
         if ($$8.a(awc.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            gfw.a(
               $$0,
               $$1,
               new euh(
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

      for (io $$10 : io.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         emw $$11 = $$6.b_($$10);
         if ($$11.a(awc.a)) {
            gfw.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
