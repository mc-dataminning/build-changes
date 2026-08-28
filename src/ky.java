public class ky extends kz {
   private final kz c = new kz();
   private final cqh.b d;
   private final boolean e;

   public ky(cqh.b $$0) {
      this($$0, false);
   }

   public ky(cqh.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cvx a(kx $$0, cvx $$1) {
      jl $$2 = $$0.d().c(dkd.b);
      arm $$3 = $$0.b();
      ezh $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bug.k.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      jg $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(axf.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).l() || !$$3.b_($$9.e()).a(axf.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cqh $$13 = (cqh)(this.e ? new cqi($$3, $$6, $$7 + $$10, $$8) : new cqh($$3, $$6, $$7 + $$10, $$8));
      bug.<cqh>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.v($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kx $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
