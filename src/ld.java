public class ld extends la {
   private final la c = new la();
   private final bvi<? extends crn> d;

   public ld(bvi<? extends crn> $$0) {
      this.d = $$0;
   }

   @Override
   public cxg a(ky $$0, cxg $$1) {
      jm $$2 = $$0.d().c(dmj.b);
      arx $$3 = $$0.b();
      fbr $$4 = $$0.a();
      double $$5 = $$4.a() + (double)$$2.j() * 1.125;
      double $$6 = Math.floor($$4.b()) + (double)$$2.k();
      double $$7 = $$4.c() + (double)$$2.l() * 1.125;
      jh $$8 = $$0.c().a($$2);
      dxo $$9 = $$3.a_($$8);
      double $$10;
      if ($$9.a(axk.P)) {
         if (a($$9).b()) {
            $$10 = 0.6;
         } else {
            $$10 = 0.1;
         }
      } else {
         if (!$$9.l()) {
            return this.c.dispense($$0, $$1);
         }

         dxo $$12 = $$3.a_($$8.e());
         if (!$$12.a(axk.P)) {
            return this.c.dispense($$0, $$1);
         }

         if ($$2 != jm.a && a($$12).b()) {
            $$10 = -0.4;
         } else {
            $$10 = -0.9;
         }
      }

      fbr $$17 = new fbr($$5, $$6 + $$10, $$7);
      crn $$18 = crn.a($$3, $$17.d, $$17.e, $$17.f, this.d, bvh.o, $$1, null);
      if ($$18 != null) {
         $$3.b($$18);
         $$1.h(1);
      }

      return $$1;
   }

   private static dyr a(dxo $$0) {
      return $$0.b() instanceof djs $$1 ? $$0.c($$1.c()) : dyr.a;
   }

   @Override
   protected void a(ky $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
