public class jh extends ji {
   private final ji c = new ji();
   private final chk.b d;
   private final boolean e;

   public jh(chk.b $$0) {
      this($$0, false);
   }

   public jh(chk.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cng a(jg $$0, cng $$1) {
      ic $$2 = $$0.d().c(czd.b);
      ane $$3 = $$0.b();
      emc $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bmc.l.k() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      hx $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(asn.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(asn.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      chk $$13 = (chk)(this.e ? new chl($$3, $$6, $$7 + $$10, $$8) : new chk($$3, $$6, $$7 + $$10, $$8));
      bmc.<chk>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.r($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(jg $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
