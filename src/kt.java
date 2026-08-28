public class kt implements ku {
   private static final int c = 6;

   @Override
   public final cuc dispense(kr $$0, cuc $$1) {
      cuc $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dhm.b));
      return $$2;
   }

   protected cuc a(kr $$0, cuc $$1) {
      jf $$2 = $$0.d().c(dhm.b);
      jt $$3 = dhm.a($$0);
      cuc $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(dcf $$0, cuc $$1, int $$2, jf $$3, jt $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == jf.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      ciu $$8 = new ciu($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.o(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(kr $$0) {
      b($$0);
   }

   protected void a(kr $$0, jf $$1) {
      b($$0, $$1);
   }

   private static void b(kr $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   private static void b(kr $$0, jf $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }

   protected cuc a(kr $$0, cuc $$1, cuc $$2) {
      $$1.h(1);
      if ($$1.e()) {
         return $$2;
      } else {
         this.b($$0, $$2);
         return $$1;
      }
   }

   private void b(kr $$0, cuc $$1) {
      cuc $$2 = $$0.e().b($$1);
      if (!$$2.e()) {
         jf $$3 = $$0.d().c(dhm.b);
         a($$0.b(), $$2, 6, $$3, dhm.a($$0));
         b($$0);
         b($$0, $$3);
      }
   }
}
