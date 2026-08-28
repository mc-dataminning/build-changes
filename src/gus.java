public class gus implements guc.a {
   private final foz a;

   public gus(foz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fjj $$0, gqa $$1, double $$2, double $$3, double $$4) {
      iu $$5 = this.a.t.dv();
      djd $$6 = this.a.t.dV();

      for (iu $$7 : iu.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         ewo $$8 = $$6.b_($$7);
         if ($$8.a(axh.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            guc.a(
               $$0,
               $$1,
               new fel(
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

      for (iu $$10 : iu.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         ewo $$11 = $$6.b_($$10);
         if ($$11.a(axh.a)) {
            guc.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
