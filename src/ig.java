public class ig implements ih {
   @Override
   public final cix dispense(gv $$0, cix $$1) {
      cix $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.e().c(cum.a));
      return $$2;
   }

   protected cix a(gv $$0, cix $$1) {
      ha $$2 = $$0.e().c(cum.a);
      ho $$3 = cum.a($$0);
      cix $$4 = $$1.a(1);
      a($$0.g(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(cpl $$0, cix $$1, int $$2, ha $$3, ho $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == ha.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      byf $$8 = new byf($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.o(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(gv $$0) {
      $$0.g().c(1000, $$0.d(), 0);
   }

   protected void a(gv $$0, ha $$1) {
      $$0.g().c(2000, $$0.d(), $$1.d());
   }
}
