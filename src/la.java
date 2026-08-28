public class la implements lb {
   private static final int c = 6;

   @Override
   public final cxk dispense(ky $$0, cxk $$1) {
      cxk $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dml.b));
      return $$2;
   }

   protected cxk a(ky $$0, cxk $$1) {
      jm $$2 = $$0.d().c(dml.b);
      ka $$3 = dml.a($$0);
      cxk $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(dha $$0, cxk $$1, int $$2, jm $$3, ka $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == jm.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      clw $$8 = new clw($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.A.j() * 0.1 + 0.2;
      $$8.n(
         $$0.A.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.A.a(0.2, 0.0172275 * (double)$$2),
         $$0.A.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(ky $$0) {
      b($$0);
   }

   protected void a(ky $$0, jm $$1) {
      b($$0, $$1);
   }

   private static void b(ky $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   private static void b(ky $$0, jm $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }

   protected cxk a(ky $$0, cxk $$1, cxk $$2) {
      $$1.h(1);
      if ($$1.f()) {
         return $$2;
      } else {
         this.b($$0, $$2);
         return $$1;
      }
   }

   private void b(ky $$0, cxk $$1) {
      cxk $$2 = $$0.e().b($$1);
      if (!$$2.f()) {
         jm $$3 = $$0.d().c(dml.b);
         a($$0.b(), $$2, 6, $$3, dml.a($$0));
         b($$0);
         b($$0, $$3);
      }
   }
}
