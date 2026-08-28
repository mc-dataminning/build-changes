public class lf extends lg {
   private final lg c = new lg();
   private final bwr<? extends ctu> d;

   public lf(bwr<? extends ctu> $$0) {
      this.d = $$0;
   }

   @Override
   public czk a(le $$0, czk $$1) {
      jb $$2 = $$0.d().c(dos.b);
      arq $$3 = $$0.b();
      fex $$4 = $$0.a();
      double $$5 = 0.5625 + (double)this.d.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      iv $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(axh.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).l() || !$$3.b_($$9.e()).a(axh.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      ctu $$13 = this.d.a($$3, bwq.o);
      if ($$13 != null) {
         $$13.p($$6, $$7 + $$10, $$8);
         bwr.<ctu>a($$3, $$1, null).accept($$13);
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
