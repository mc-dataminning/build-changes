public class ks extends kt {
   private final kt c = new kt();
   private final coe.b d;
   private final boolean e;

   public ks(coe.b $$0) {
      this($$0, false);
   }

   public ks(coe.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cua a(kr $$0, cua $$1) {
      jf $$2 = $$0.d().c(dhk.b);
      aqk $$3 = $$0.b();
      evz $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bsj.k.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      ja $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(awa.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(awa.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      coe $$13 = (coe)(this.e ? new cof($$3, $$6, $$7 + $$10, $$8) : new coe($$3, $$6, $$7 + $$10, $$8));
      bsj.<coe>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.s($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kr $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
