public class gwv implements gwf.a {
   private final frf a;

   public gwv(frf $$0) {
      this.a = $$0;
   }

   @Override
   public void a(flq $$0, gsc $$1, double $$2, double $$3, double $$4) {
      iw $$5 = this.a.t.dv();
      dkc $$6 = this.a.t.dV();

      for (iw $$7 : iw.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         exq $$8 = $$6.b_($$7);
         if ($$8.a(axl.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            gwf.a(
               $$0,
               $$1,
               new ffn(
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

      for (iw $$10 : iw.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         exq $$11 = $$6.b_($$10);
         if ($$11.a(axl.a)) {
            gwf.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
