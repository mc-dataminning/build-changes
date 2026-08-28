public class gif implements ghr.a {
   private final ffw a;

   public gif(ffw $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fao $$0, gef $$1, double $$2, double $$3, double $$4) {
      ja $$5 = this.a.s.dr();
      dcj $$6 = this.a.s.dR();

      for (ja $$7 : ja.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         eoj $$8 = $$6.b_($$7);
         if ($$8.a(awc.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            ghr.a(
               $$0,
               $$1,
               new ewc(
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

      for (ja $$10 : ja.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         eoj $$11 = $$6.b_($$10);
         if ($$11.a(awc.a)) {
            ghr.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
