public class gmb implements gll.a {
   private final fip a;

   public gmb(fip $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fdi $$0, ghl $$1, double $$2, double $$3, double $$4) {
      jf $$5 = this.a.t.ds();
      dem $$6 = this.a.t.dS();

      for (jf $$7 : jf.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         eqt $$8 = $$6.b_($$7);
         if ($$8.a(axb.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            gll.a(
               $$0,
               $$1,
               new eyr(
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

      for (jf $$10 : jf.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         eqt $$11 = $$6.b_($$10);
         if ($$11.a(axb.a)) {
            gll.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
