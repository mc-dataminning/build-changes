public class lh implements li {
   private static final int c = 6;

   @Override
   public final dak dispense(lf $$0, dak $$1) {
      dak $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dpu.b));
      return $$2;
   }

   protected dak a(lf $$0, dak $$1) {
      jc $$2 = $$0.d().c(dpu.b);
      jq $$3 = dpu.a($$0);
      dak $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(dkj $$0, dak $$1, int $$2, jc $$3, jq $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == jc.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      coo $$8 = new coo($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.A.j() * 0.1 + 0.2;
      $$8.n(
         $$0.A.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.A.a(0.2, 0.0172275 * (double)$$2),
         $$0.A.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(lf $$0) {
      b($$0);
   }

   protected void a(lf $$0, jc $$1) {
      b($$0, $$1);
   }

   private static void b(lf $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   private static void b(lf $$0, jc $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }

   protected dak a(lf $$0, dak $$1, dak $$2) {
      $$1.h(1);
      if ($$1.f()) {
         return $$2;
      } else {
         this.b($$0, $$2);
         return $$1;
      }
   }

   private void b(lf $$0, dak $$1) {
      dak $$2 = $$0.e().b($$1);
      if (!$$2.f()) {
         jc $$3 = $$0.d().c(dpu.b);
         a($$0.b(), $$2, 6, $$3, dpu.a($$0));
         b($$0);
         b($$0, $$3);
      }
   }
}
