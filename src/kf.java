public class kf extends kg {
   private final kg c = new kg();
   private final cmi.b d;
   private final boolean e;

   public kf(cmi.b $$0) {
      this($$0, false);
   }

   public kf(cmi.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public csd a(ke $$0, csd $$1) {
      ir $$2 = $$0.d().c(dfa.b);
      aqe $$3 = $$0.b();
      etf $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bqr.k.k() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      im $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(avt.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(avt.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cmi $$13 = (cmi)(this.e ? new cmj($$3, $$6, $$7 + $$10, $$8) : new cmi($$3, $$6, $$7 + $$10, $$8));
      bqr.<cmi>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.r($$2.p());
      $$3.b($$13);
      $$1.g(1);
      return $$1;
   }

   @Override
   protected void a(ke $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
