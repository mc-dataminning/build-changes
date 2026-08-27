public class ie extends ig {
   private final ig c = new ig();
   private final cdt.b d;
   private final boolean e;

   public ie(cdt.b $$0) {
      this($$0, false);
   }

   public ie(cdt.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cjl a(id $$0, cjl $$1) {
      ha $$2 = $$0.d().c(cvf.b);
      cqb $$3 = $$0.b();
      ehh $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bja.k.k() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      gw $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(aqa.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(aqa.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cdt $$13 = (cdt)(this.e ? new cdu($$3, $$6, $$7 + $$10, $$8) : new cdt($$3, $$6, $$7 + $$10, $$8));
      $$13.a(this.d);
      $$13.r($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(id $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
