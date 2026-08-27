public class jg implements jh {
   @Override
   public final cmh dispense(je $$0, cmh $$1) {
      cmh $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(cye.b));
      return $$2;
   }

   protected cmh a(je $$0, cmh $$1) {
      ia $$2 = $$0.d().c(cye.b);
      ip $$3 = cye.a($$0);
      cmh $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(csy $$0, cmh $$1, int $$2, ia $$3, ip $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == ia.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      cbe $$8 = new cbe($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.o(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(je $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   protected void a(je $$0, ia $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }
}
