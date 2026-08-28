public class li extends lf {
   private final lf c = new lf();
   private final bwo<? extends ctp> d;

   public li(bwo<? extends ctp> $$0) {
      this.d = $$0;
   }

   @Override
   public czd a(ld $$0, czd $$1) {
      ja $$2 = $$0.d().c(dol.b);
      arq $$3 = $$0.b();
      feq $$4 = $$0.a();
      double $$5 = $$4.a() + (double)$$2.j() * 1.125;
      double $$6 = Math.floor($$4.b()) + (double)$$2.k();
      double $$7 = $$4.c() + (double)$$2.l() * 1.125;
      iu $$8 = $$0.c().a($$2);
      eah $$9 = $$3.a_($$8);
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

         eah $$12 = $$3.a_($$8.e());
         if (!$$12.a(axc.P)) {
            return this.c.dispense($$0, $$1);
         }

         if ($$2 != ja.a && a($$12).b()) {
            $$10 = -0.4;
         } else {
            $$10 = -0.9;
         }
      }

      feq $$17 = new feq($$5, $$6 + $$10, $$7);
      ctp $$18 = ctp.a($$3, $$17.d, $$17.e, $$17.f, this.d, bwn.o, $$1, null);
      if ($$18 != null) {
         $$3.b($$18);
         $$1.h(1);
      }

      return $$1;
   }

   private static ebl a(eah $$0) {
      return $$0.b() instanceof dlu $$1 ? $$0.c($$1.c()) : ebl.a;
   }

   @Override
   protected void a(ld $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
