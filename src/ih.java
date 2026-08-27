public class ih extends ii {
   private final ii c = new ii();
   private final cdp.b d;
   private final boolean e;

   public ih(cdp.b $$0) {
      this($$0, false);
   }

   public ih(cdp.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cjh a(gx $$0, cjh $$1) {
      hc $$2 = $$0.e().c(cuy.a);
      cpx $$3 = $$0.g();
      double $$4 = 0.5625 + (double)biw.k.k() / 2.0;
      double $$5 = $$0.a() + (double)$$2.j() * $$4;
      double $$6 = $$0.b() + (double)((float)$$2.k() * 1.125F);
      double $$7 = $$0.c() + (double)$$2.l() * $$4;
      gw $$8 = $$0.d().a($$2);
      double $$9;
      if ($$3.b_($$8).a(apz.a)) {
         $$9 = 1.0;
      } else {
         if (!$$3.a_($$8).i() || !$$3.b_($$8.d()).a(apz.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$9 = 0.0;
      }

      cdp $$12 = (cdp)(this.e ? new cdq($$3, $$5, $$6 + $$9, $$7) : new cdp($$3, $$5, $$6 + $$9, $$7));
      $$12.a(this.d);
      $$12.r($$2.p());
      $$3.b($$12);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(gx $$0) {
      $$0.g().c(1000, $$0.d(), 0);
   }
}
