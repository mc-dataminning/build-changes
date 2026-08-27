public class jh implements ji {
   @Override
   public final clo dispense(jf $$0, clo $$1) {
      clo $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(cxk.b));
      return $$2;
   }

   protected clo a(jf $$0, clo $$1) {
      ib $$2 = $$0.d().c(cxk.b);
      iq $$3 = cxk.a($$0);
      clo $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(csf $$0, clo $$1, int $$2, ib $$3, iq $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == ib.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      cas $$8 = new cas($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.o(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(jf $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   protected void a(jf $$0, ib $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }
}
