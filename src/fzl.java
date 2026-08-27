public class fzl implements fyx.a {
   private final exh a;

   public fzl(exh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(esa $$0, fvm $$1, double $$2, double $$3, double $$4) {
      hz $$5 = this.a.s.dm();
      cvq $$6 = this.a.s.dM();

      for (hz $$7 : hz.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         egp $$8 = $$6.b_($$7);
         if ($$8.a(aue.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            fyx.a(
               $$0,
               $$1,
               new enn(
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

      for (hz $$10 : hz.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         egp $$11 = $$6.b_($$10);
         if ($$11.a(aue.a)) {
            fyx.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
