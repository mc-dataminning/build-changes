public class le extends lf {
   private final lf c = new lf();
   private final bwj<? extends ctc> d;

   public le(bwj<? extends ctc> $$0) {
      this.d = $$0;
   }

   @Override
   public cys a(ld $$0, cys $$1) {
      ja $$2 = $$0.d().c(doa.b);
      aro $$3 = $$0.b();
      fdw $$4 = $$0.a();
      double $$5 = 0.5625 + (double)this.d.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      iu $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(axf.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).l() || !$$3.b_($$9.e()).a(axf.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      ctc $$13 = this.d.a($$3, bwi.o);
      if ($$13 != null) {
         $$13.p($$6, $$7 + $$10, $$8);
         bwj.<ctc>a($$3, $$1, null).accept($$13);
         $$13.w($$2.p());
         $$3.b($$13);
         $$1.h(1);
      }

      return $$1;
   }

   @Override
   protected void a(ld $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
