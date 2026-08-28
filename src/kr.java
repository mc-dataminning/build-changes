public class kr extends ks {
   private final ks c = new ks();
   private final cot.b d;
   private final boolean e;

   public kr(cot.b $$0) {
      this($$0, false);
   }

   public kr(cot.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cun a(kq $$0, cun $$1) {
      je $$2 = $$0.d().c(dhc.b);
      are $$3 = $$0.b();
      evp $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bsy.k.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      iz $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(awu.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(awu.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cot $$13 = (cot)(this.e ? new cou($$3, $$6, $$7 + $$10, $$8) : new cot($$3, $$6, $$7 + $$10, $$8));
      bsy.<cot>a($$3, $$1, null).accept($$13);
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
