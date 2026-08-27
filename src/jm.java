public class jm implements jn {
   @Override
   public final cpq dispense(jk $$0, cpq $$1) {
      cpq $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dbk.b));
      return $$2;
   }

   protected cpq a(jk $$0, cpq $$1) {
      ih $$2 = $$0.d().c(dbk.b);
      iv $$3 = dbk.a($$0);
      cpq $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(cwe $$0, cpq $$1, int $$2, ih $$3, iv $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == ih.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      cel $$8 = new cel($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.o(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(jk $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   protected void a(jk $$0, ih $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }
}
