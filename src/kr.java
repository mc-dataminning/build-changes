public class kr extends ks {
   private final ks c = new ks();
   private final coq.b d;
   private final boolean e;

   public kr(coq.b $$0) {
      this($$0, false);
   }

   public kr(coq.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cuk a(kq $$0, cuk $$1) {
      je $$2 = $$0.d().c(dgz.b);
      arb $$3 = $$0.b();
      evm $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bsv.k.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      iz $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(awr.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(awr.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      coq $$13 = (coq)(this.e ? new cor($$3, $$6, $$7 + $$10, $$8) : new coq($$3, $$6, $$7 + $$10, $$8));
      bsv.<coq>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.r($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kq $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
