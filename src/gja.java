public class gja implements gim.a {
   private final fgo a;

   public gja(fgo $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fbi $$0, gez $$1, double $$2, double $$3, double $$4) {
      jd $$5 = this.a.s.do();
      dcz $$6 = this.a.s.dO();

      for (jd $$7 : jd.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         epe $$8 = $$6.b_($$7);
         if ($$8.a(awk.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            gim.a(
               $$0,
               $$1,
               new ewx(
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
         epe $$11 = $$6.b_($$10);
         if ($$11.a(awk.a)) {
            gim.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
