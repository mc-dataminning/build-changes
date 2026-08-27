public class jk implements jl {
   @Override
   public final cpd dispense(ji $$0, cpd $$1) {
      cpd $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dax.b));
      return $$2;
   }

   protected cpd a(ji $$0, cpd $$1) {
      ie $$2 = $$0.d().c(dax.b);
      it $$3 = dax.a($$0);
      cpd $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(cvr $$0, cpd $$1, int $$2, ie $$3, it $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == ie.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      cdw $$8 = new cdw($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.o(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(ji $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   protected void a(ji $$0, ie $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }
}
