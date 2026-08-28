public class li extends lf {
   private final lf c = new lf();
   private final bwj<? extends cte> d;

   public li(bwj<? extends cte> $$0) {
      this.d = $$0;
   }

   @Override
   public cys a(ld $$0, cys $$1) {
      ja $$2 = $$0.d().c(doa.b);
      aro $$3 = $$0.b();
      fdw $$4 = $$0.a();
      double $$5 = $$4.a() + (double)$$2.j() * 1.125;
      double $$6 = Math.floor($$4.b()) + (double)$$2.k();
      double $$7 = $$4.c() + (double)$$2.l() * 1.125;
      iu $$8 = $$0.c().a($$2);
      dzo $$9 = $$3.a_($$8);
      double $$10;
      if ($$9.a(axa.P)) {
         if (a($$9).b()) {
            $$10 = 0.6;
         } else {
            $$10 = 0.1;
         }
      } else {
         if (!$$9.l()) {
            return this.c.dispense($$0, $$1);
         }

         dzo $$12 = $$3.a_($$8.e());
         if (!$$12.a(axa.P)) {
            return this.c.dispense($$0, $$1);
         }

         if ($$2 != ja.a && a($$12).b()) {
            $$10 = -0.4;
         } else {
            $$10 = -0.9;
         }
      }

      fdw $$17 = new fdw($$5, $$6 + $$10, $$7);
      cte $$18 = cte.a($$3, $$17.d, $$17.e, $$17.f, this.d, bwi.o, $$1, null);
      if ($$18 != null) {
         $$3.b($$18);
         $$1.h(1);
      }

      return $$1;
   }

   private static eas a(dzo $$0) {
      return $$0.b() instanceof dlj $$1 ? $$0.c($$1.c()) : eas.a;
   }

   @Override
   protected void a(ld $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
