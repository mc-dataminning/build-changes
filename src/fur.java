public class fur implements fud.a {
   private final etd a;

   public fur(etd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(enw $$0, fqu $$1, double $$2, double $$3, double $$4) {
      ht $$5 = this.a.s.dn();
      csd $$6 = this.a.s.dN();

      for (ht $$7 : ht.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         ecs $$8 = $$6.b_($$7);
         if ($$8.a(arl.a)) {
            double $$9 = (double)((float)$$7.v() + $$8.a($$6, $$7));
            fud.a(
               $$0,
               $$1,
               new ejp(
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

      for (ht $$10 : ht.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         ecs $$11 = $$6.b_($$10);
         if ($$11.a(arl.a)) {
            fud.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a($$6, $$10)), (double)$$10.w() + 0.5, -16777216);
         }
      }
   }
}
