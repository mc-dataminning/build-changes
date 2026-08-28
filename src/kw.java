public class kw implements kx {
   private static final int c = 6;

   @Override
   public final cuo dispense(ku $$0, cuo $$1) {
      cuo $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dib.b));
      return $$2;
   }

   protected cuo a(ku $$0, cuo $$1) {
      ji $$2 = $$0.d().c(dib.b);
      jw $$3 = dib.a($$0);
      cuo $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(dcu $$0, cuo $$1, int $$2, ji $$3, jw $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == ji.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      cjf $$8 = new cjf($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.n(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(ku $$0) {
      b($$0);
   }

   protected void a(ku $$0, ji $$1) {
      b($$0, $$1);
   }

   private static void b(ku $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   private static void b(ku $$0, ji $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }

   protected cuo a(ku $$0, cuo $$1, cuo $$2) {
      $$1.h(1);
      if ($$1.e()) {
         return $$2;
      } else {
         this.b($$0, $$2);
         return $$1;
      }
   }

   private void b(ku $$0, cuo $$1) {
      cuo $$2 = $$0.e().b($$1);
      if (!$$2.e()) {
         ji $$3 = $$0.d().c(dib.b);
         a($$0.b(), $$2, 6, $$3, dib.a($$0));
         b($$0);
         b($$0, $$3);
      }
   }
}
