public class kz extends la {
   private final la c = new la();
   private final cqm.b d;
   private final boolean e;

   public kz(cqm.b $$0) {
      this($$0, false);
   }

   public kz(cqm.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cwb a(ky $$0, cwb $$1) {
      jm $$2 = $$0.d().c(dkj.b);
      arn $$3 = $$0.b();
      ezn $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bul.k.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      jh $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(axg.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).l() || !$$3.b_($$9.e()).a(axg.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cqm $$13 = (cqm)(this.e ? new cqn($$3, $$6, $$7 + $$10, $$8) : new cqm($$3, $$6, $$7 + $$10, $$8));
      bul.<cqm>a($$3, $$1, null).accept($$13);
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
