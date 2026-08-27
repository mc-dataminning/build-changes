public class jm extends jn {
   private final jn c = new jn();
   private final ckp.b d;
   private final boolean e;

   public jm(ckp.b $$0) {
      this($$0, false);
   }

   public jm(ckp.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cqk a(jl $$0, cqk $$1) {
      ih $$2 = $$0.d().c(dcf.b);
      apf $$3 = $$0.b();
      epr $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bpc.l.k() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      ib $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(aus.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(aus.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      ckp $$13 = (ckp)(this.e ? new ckq($$3, $$6, $$7 + $$10, $$8) : new ckp($$3, $$6, $$7 + $$10, $$8));
      bpc.<ckp>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.r($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(jl $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
