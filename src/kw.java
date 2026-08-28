public class kw extends kx {
   private final kx c = new kx();
   private final cpo.b d;
   private final boolean e;

   public kw(cpo.b $$0) {
      this($$0, false);
   }

   public kw(cpo.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cvl a(kv $$0, cvl $$1) {
      jj $$2 = $$0.d().c(dja.b);
      arg $$3 = $$0.b();
      eye $$4 = $$0.a();
      double $$5 = 0.5625 + (double)btq.k.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      je $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(awy.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).l() || !$$3.b_($$9.e()).a(awy.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cpo $$13 = (cpo)(this.e ? new cpp($$3, $$6, $$7 + $$10, $$8) : new cpo($$3, $$6, $$7 + $$10, $$8));
      btq.<cpo>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.v($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kv $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
