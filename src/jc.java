public class jc extends jd {
   private final jd c = new jd();
   private final ceq.b d;
   private final boolean e;

   public jc(ceq.b $$0) {
      this($$0, false);
   }

   public jc(ceq.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public ckj a(jb $$0, ckj $$1) {
      hx $$2 = $$0.d().c(cwd.b);
      alq $$3 = $$0.b();
      eif $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bjx.k.k() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      ht $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(aqx.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(aqx.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      ceq $$13 = (ceq)(this.e ? new cer($$3, $$6, $$7 + $$10, $$8) : new ceq($$3, $$6, $$7 + $$10, $$8));
      bjx.<ceq>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.r($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(jb $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
