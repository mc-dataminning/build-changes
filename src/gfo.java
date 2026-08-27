public class gfo implements gfa.a {
   private final fde a;

   public gfo(fde $$0) {
      this.a = $$0;
   }

   @Override
   public void a(exx $$0, gbo $$1, double $$2, double $$3, double $$4) {
      in $$5 = this.a.s.dn();
      dag $$6 = this.a.s.dN();

      for (in $$7 : in.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         ema $$8 = $$6.b_($$7);
         if ($$8.a(avw.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            gfa.a(
               $$0,
               $$1,
               new etk(
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

      for (in $$10 : in.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         ema $$11 = $$6.b_($$10);
         if ($$11.a(avw.a)) {
            gfa.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
