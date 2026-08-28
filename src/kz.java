public class kz extends la {
   private final la c = new la();
   private final cqq.b d;
   private final boolean e;

   public kz(cqq.b $$0) {
      this($$0, false);
   }

   public kz(cqq.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cwf a(ky $$0, cwf $$1) {
      jm $$2 = $$0.d().c(dko.b);
      arq $$3 = $$0.b();
      ezr $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bup.k.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      jh $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(axj.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).l() || !$$3.b_($$9.e()).a(axj.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cqq $$13 = (cqq)(this.e ? new cqr($$3, $$6, $$7 + $$10, $$8) : new cqq($$3, $$6, $$7 + $$10, $$8));
      bup.<cqq>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.v($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(ky $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
