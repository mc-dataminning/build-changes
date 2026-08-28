public class ky implements kz {
   private static final int c = 6;

   @Override
   public final cvs dispense(kw $$0, cvs $$1) {
      cvs $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(djr.b));
      return $$2;
   }

   protected cvs a(kw $$0, cvs $$1) {
      jk $$2 = $$0.d().c(djr.b);
      jy $$3 = djr.a($$0);
      cvs $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(dej $$0, cvs $$1, int $$2, jk $$3, jy $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == jk.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      ckh $$8 = new ckh($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.n(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(kw $$0) {
      b($$0);
   }

   protected void a(kw $$0, jk $$1) {
      b($$0, $$1);
   }

   private static void b(kw $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   private static void b(kw $$0, jk $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }

   protected cvs a(kw $$0, cvs $$1, cvs $$2) {
      $$1.h(1);
      if ($$1.f()) {
         return $$2;
      } else {
         this.b($$0, $$2);
         return $$1;
      }
   }

   private void b(kw $$0, cvs $$1) {
      cvs $$2 = $$0.e().b($$1);
      if (!$$2.f()) {
         jk $$3 = $$0.d().c(djr.b);
         a($$0.b(), $$2, 6, $$3, djr.a($$0));
         b($$0);
         b($$0, $$3);
      }
   }
}
