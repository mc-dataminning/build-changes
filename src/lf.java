public class lf implements lg {
   private static final int c = 6;

   @Override
   public final cyy dispense(ld $$0, cyy $$1) {
      cyy $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dog.b));
      return $$2;
   }

   protected cyy a(ld $$0, cyy $$1) {
      ja $$2 = $$0.d().c(dog.b);
      jo $$3 = dog.a($$0);
      cyy $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(div $$0, cyy $$1, int $$2, ja $$3, jo $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == ja.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      cnd $$8 = new cnd($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.A.j() * 0.1 + 0.2;
      $$8.n(
         $$0.A.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.A.a(0.2, 0.0172275 * (double)$$2),
         $$0.A.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(ld $$0) {
      b($$0);
   }

   protected void a(ld $$0, ja $$1) {
      b($$0, $$1);
   }

   private static void b(ld $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   private static void b(ld $$0, ja $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }

   protected cyy a(ld $$0, cyy $$1, cyy $$2) {
      $$1.h(1);
      if ($$1.f()) {
         return $$2;
      } else {
         this.b($$0, $$2);
         return $$1;
      }
   }

   private void b(ld $$0, cyy $$1) {
      cyy $$2 = $$0.e().b($$1);
      if (!$$2.f()) {
         ja $$3 = $$0.d().c(dog.b);
         a($$0.b(), $$2, 6, $$3, dog.a($$0));
         b($$0);
         b($$0, $$3);
      }
   }
}
