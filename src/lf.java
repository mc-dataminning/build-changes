public class lf extends lg {
   private final lg c = new lg();
   private final bxc<? extends cui> d;

   public lf(bxc<? extends cui> $$0) {
      this.d = $$0;
   }

   @Override
   public czy a(le $$0, czy $$1) {
      jb $$2 = $$0.d().c(dpi.b);
      ars $$3 = $$0.b();
      ffq $$4 = $$0.a();
      double $$5 = 0.5625 + (double)this.d.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      iv $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(axj.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).l() || !$$3.b_($$9.e()).a(axj.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cui $$13 = this.d.a($$3, bxb.o);
      if ($$13 != null) {
         $$13.p($$6, $$7 + $$10, $$8);
         bxc.<cui>a($$3, $$1, null).accept($$13);
         $$13.w($$2.p());
         $$3.b($$13);
         $$1.h(1);
      }

      return $$1;
   }

   @Override
   protected void a(le $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
