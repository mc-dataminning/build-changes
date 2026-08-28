public class kr extends ks {
   private final ks c = new ks();
   private final cox.b d;
   private final boolean e;

   public kr(cox.b $$0) {
      this($$0, false);
   }

   public kr(cox.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cur a(kq $$0, cur $$1) {
      je $$2 = $$0.d().c(dhg.b);
      arf $$3 = $$0.b();
      evt $$4 = $$0.a();
      double $$5 = 0.5625 + (double)btc.k.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      iz $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(awv.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(awv.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cox $$13 = (cox)(this.e ? new coy($$3, $$6, $$7 + $$10, $$8) : new cox($$3, $$6, $$7 + $$10, $$8));
      btc.<cox>a($$3, $$1, null).accept($$13);
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
