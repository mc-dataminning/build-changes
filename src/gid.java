public class gid implements ghp.a {
   private final fft a;

   public gid(fft $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fam $$0, ged $$1, double $$2, double $$3, double $$4) {
      ja $$5 = this.a.s.dq();
      dci $$6 = this.a.s.dQ();

      for (ja $$7 : ja.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         eoh $$8 = $$6.b_($$7);
         if ($$8.a(awc.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            ghp.a(
               $$0,
               $$1,
               new ewa(
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
         eoh $$11 = $$6.b_($$10);
         if ($$11.a(awc.a)) {
            ghp.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
