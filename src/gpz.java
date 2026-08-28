public class gpz implements gpj.a {
   private final fme a;

   public gpz(fme $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fgq $$0, glj $$1, double $$2, double $$3, double $$4) {
      jh $$5 = this.a.t.dv();
      dhk $$6 = this.a.t.dV();

      for (jh $$7 : jh.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         etw $$8 = $$6.b_($$7);
         if ($$8.a(aya.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            gpj.a(
               $$0,
               $$1,
               new fbs(
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

      for (jh $$10 : jh.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         etw $$11 = $$6.b_($$10);
         if ($$11.a(aya.a)) {
            gpj.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
