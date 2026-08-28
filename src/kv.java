public class kv extends kw {
   private final kw c = new kw();
   private final cov.b d;
   private final boolean e;

   public kv(cov.b $$0) {
      this($$0, false);
   }

   public kv(cov.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cuq a(ku $$0, cuq $$1) {
      ji $$2 = $$0.d().c(did.b);
      aqu $$3 = $$0.b();
      exc $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bsx.k.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      jd $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(awk.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.e()).a(awk.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cov $$13 = (cov)(this.e ? new cow($$3, $$6, $$7 + $$10, $$8) : new cov($$3, $$6, $$7 + $$10, $$8));
      bsx.<cov>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.t($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(ku $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
