public class kg extends kh {
   private final kh c = new kh();
   private final cne.b d;
   private final boolean e;

   public kg(cne.b $$0) {
      this($$0, false);
   }

   public kg(cne.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public csz a(kf $$0, csz $$1) {
      is $$2 = $$0.d().c(dfj.b);
      aqh $$3 = $$0.b();
      etp $$4 = $$0.a();
      double $$5 = 0.5625 + (double)brn.k.k() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      in $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(avw.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(avw.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cne $$13 = (cne)(this.e ? new cnf($$3, $$6, $$7 + $$10, $$8) : new cne($$3, $$6, $$7 + $$10, $$8));
      brn.<cne>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.r($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kf $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
