public class kz extends la {
   private final la c = new la();
   private final bvq<? extends crt> d;

   public kz(bvq<? extends crt> $$0) {
      this.d = $$0;
   }

   @Override
   public cxo a(ky $$0, cxo $$1) {
      jm $$2 = $$0.d().c(dms.b);
      ash $$3 = $$0.b();
      fbx $$4 = $$0.a();
      double $$5 = 0.5625 + (double)this.d.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      jh $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(aya.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).l() || !$$3.b_($$9.e()).a(aya.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      crt $$13 = this.d.a($$3, bvp.o);
      if ($$13 != null) {
         $$13.p($$6, $$7 + $$10, $$8);
         bvq.<crt>a($$3, $$1, null).accept($$13);
         $$13.v($$2.p());
         $$3.b($$13);
         $$1.h(1);
      }

      return $$1;
   }

   @Override
   protected void a(ky $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
