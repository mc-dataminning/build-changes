public class lg extends lh {
   private final lh c = new lh();
   private final bxe<? extends cuk> d;

   public lg(bxe<? extends cuk> $$0) {
      this.d = $$0;
   }

   @Override
   public daa a(lf $$0, daa $$1) {
      jc $$2 = $$0.d().c(dpk.b);
      aru $$3 = $$0.b();
      ffs $$4 = $$0.a();
      double $$5 = 0.5625 + (double)this.d.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      iw $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(axl.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).l() || !$$3.b_($$9.e()).a(axl.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cuk $$13 = this.d.a($$3, bxd.o);
      if ($$13 != null) {
         $$13.p($$6, $$7 + $$10, $$8);
         bxe.<cuk>a($$3, $$1, null).accept($$13);
         $$13.w($$2.p());
         $$3.b($$13);
         $$1.h(1);
      }

      return $$1;
   }

   @Override
   protected void a(lf $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
