public class lj extends lg {
   private final lg c = new lg();
   private final bwr<? extends ctw> d;

   public lj(bwr<? extends ctw> $$0) {
      this.d = $$0;
   }

   @Override
   public czk a(le $$0, czk $$1) {
      jb $$2 = $$0.d().c(dos.b);
      arq $$3 = $$0.b();
      fex $$4 = $$0.a();
      double $$5 = $$4.a() + (double)$$2.j() * 1.125;
      double $$6 = Math.floor($$4.b()) + (double)$$2.k();
      double $$7 = $$4.c() + (double)$$2.l() * 1.125;
      iv $$8 = $$0.c().a($$2);
      eao $$9 = $$3.a_($$8);
      double $$10;
      if ($$9.a(axc.P)) {
         if (a($$9).b()) {
            $$10 = 0.6;
         } else {
            $$10 = 0.1;
         }
      } else {
         if (!$$9.l()) {
            return this.c.dispense($$0, $$1);
         }

         eao $$12 = $$3.a_($$8.e());
         if (!$$12.a(axc.P)) {
            return this.c.dispense($$0, $$1);
         }

         if ($$2 != jb.a && a($$12).b()) {
            $$10 = -0.4;
         } else {
            $$10 = -0.9;
         }
      }

      fex $$17 = new fex($$5, $$6 + $$10, $$7);
      ctw $$18 = ctw.a($$3, $$17.d, $$17.e, $$17.f, this.d, bwq.o, $$1, null);
      if ($$18 != null) {
         $$3.b($$18);
         $$1.h(1);
      }

      return $$1;
   }

   private static ebs a(eao $$0) {
      return $$0.b() instanceof dmb $$1 ? $$0.c($$1.c()) : ebs.a;
   }

   @Override
   protected void a(le $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
