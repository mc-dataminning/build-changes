public class kl implements km {
   @Override
   public final cuh dispense(kj $$0, cuh $$1) {
      cuh $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dhi.b));
      return $$2;
   }

   protected cuh a(kj $$0, cuh $$1) {
      iw $$2 = $$0.d().c(dhi.b);
      jk $$3 = dhi.a($$0);
      cuh $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(dca $$0, cuh $$1, int $$2, iw $$3, jk $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == iw.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      cig $$8 = new cig($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.A.j() * 0.1 + 0.2;
      $$8.o(
         $$0.A.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.A.a(0.2, 0.0172275 * (double)$$2),
         $$0.A.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(kj $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   protected void a(kj $$0, iw $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }
}
