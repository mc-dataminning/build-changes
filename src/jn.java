public class jn implements jo {
   @Override
   public final cqm dispense(jl $$0, cqm $$1) {
      cqm $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dch.b));
      return $$2;
   }

   protected cqm a(jl $$0, cqm $$1) {
      ih $$2 = $$0.d().c(dch.b);
      iv $$3 = dch.a($$0);
      cqm $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(cxb $$0, cqm $$1, int $$2, ih $$3, iv $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == ih.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      cfe $$8 = new cfe($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.o(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(jl $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   protected void a(jl $$0, ih $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }
}
