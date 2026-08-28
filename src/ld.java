public class ld extends la {
   private final la c = new la();
   private final bvr<? extends crw> d;

   public ld(bvr<? extends crw> $$0) {
      this.d = $$0;
   }

   @Override
   public cxp a(ky $$0, cxp $$1) {
      jm $$2 = $$0.d().c(dmt.b);
      ash $$3 = $$0.b();
      fby $$4 = $$0.a();
      double $$5 = $$4.a() + (double)$$2.j() * 1.125;
      double $$6 = Math.floor($$4.b()) + (double)$$2.k();
      double $$7 = $$4.c() + (double)$$2.l() * 1.125;
      jh $$8 = $$0.c().a($$2);
      dxv $$9 = $$3.a_($$8);
      double $$10;
      if ($$9.a(axu.P)) {
         if (a($$9).b()) {
            $$10 = 0.6;
         } else {
            $$10 = 0.1;
         }
      } else {
         if (!$$9.l()) {
            return this.c.dispense($$0, $$1);
         }

         dxv $$12 = $$3.a_($$8.e());
         if (!$$12.a(axu.P)) {
            return this.c.dispense($$0, $$1);
         }

         if ($$2 != jm.a && a($$12).b()) {
            $$10 = -0.4;
         } else {
            $$10 = -0.9;
         }
      }

      fby $$17 = new fby($$5, $$6 + $$10, $$7);
      crw $$18 = crw.a($$3, $$17.d, $$17.e, $$17.f, this.d, bvq.o, $$1, null);
      if ($$18 != null) {
         $$3.b($$18);
         $$1.h(1);
      }

      return $$1;
   }

   private static dyy a(dxv $$0) {
      return $$0.b() instanceof dkb $$1 ? $$0.c($$1.c()) : dyy.a;
   }

   @Override
   protected void a(ky $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
