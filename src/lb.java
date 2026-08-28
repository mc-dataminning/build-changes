public class lb implements lc {
   private static final int c = 6;

   @Override
   public final cwp dispense(kz $$0, cwp $$1) {
      cwp $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dls.b));
      return $$2;
   }

   protected cwp a(kz $$0, cwp $$1) {
      jn $$2 = $$0.d().c(dls.b);
      kb $$3 = dls.a($$0);
      cwp $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(dgi $$0, cwp $$1, int $$2, jn $$3, kb $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == jn.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      clb $$8 = new clb($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.A.j() * 0.1 + 0.2;
      $$8.n(
         $$0.A.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.A.a(0.2, 0.0172275 * (double)$$2),
         $$0.A.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(kz $$0) {
      b($$0);
   }

   protected void a(kz $$0, jn $$1) {
      b($$0, $$1);
   }

   private static void b(kz $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   private static void b(kz $$0, jn $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }

   protected cwp a(kz $$0, cwp $$1, cwp $$2) {
      $$1.h(1);
      if ($$1.f()) {
         return $$2;
      } else {
         this.b($$0, $$2);
         return $$1;
      }
   }

   private void b(kz $$0, cwp $$1) {
      cwp $$2 = $$0.e().b($$1);
      if (!$$2.f()) {
         jn $$3 = $$0.d().c(dls.b);
         a($$0.b(), $$2, 6, $$3, dls.a($$0));
         b($$0);
         b($$0, $$3);
      }
   }
}
