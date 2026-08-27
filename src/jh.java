public class jh extends ji {
   private final ji c = new ji();
   private final chb.b d;
   private final boolean e;

   public jh(chb.b $$0) {
      this($$0, false);
   }

   public jh(chb.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cmx a(jg $$0, cmx $$1) {
      ic $$2 = $$0.d().c(cyu.b);
      and $$3 = $$0.b();
      els $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bly.k.k() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      hx $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(asl.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(asl.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      chb $$13 = (chb)(this.e ? new chc($$3, $$6, $$7 + $$10, $$8) : new chb($$3, $$6, $$7 + $$10, $$8));
      bly.<chb>a($$3, $$1, null).accept($$13);
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
