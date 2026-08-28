public class ks implements kt {
   @Override
   public final cur dispense(kq $$0, cur $$1) {
      cur $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dhg.b));
      return $$2;
   }

   protected cur a(kq $$0, cur $$1) {
      je $$2 = $$0.d().c(dhg.b);
      js $$3 = dhg.a($$0);
      cur $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(dca $$0, cur $$1, int $$2, je $$3, js $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == je.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      cjj $$8 = new cjj($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.o(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(kq $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   protected void a(kq $$0, je $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }
}
