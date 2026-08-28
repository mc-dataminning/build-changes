public class ld extends la {
   private final la c = new la();
   private final bvm<? extends crr> d;

   public ld(bvm<? extends crr> $$0) {
      this.d = $$0;
   }

   @Override
   public cxk a(ky $$0, cxk $$1) {
      jm $$2 = $$0.d().c(dml.b);
      ash $$3 = $$0.b();
      fbs $$4 = $$0.a();
      double $$5 = $$4.a() + (double)$$2.j() * 1.125;
      double $$6 = Math.floor($$4.b()) + (double)$$2.k();
      double $$7 = $$4.c() + (double)$$2.l() * 1.125;
      jh $$8 = $$0.c().a($$2);
      dxn $$9 = $$3.a_($$8);
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

         dxn $$12 = $$3.a_($$8.e());
         if (!$$12.a(axu.P)) {
            return this.c.dispense($$0, $$1);
         }

         if ($$2 != jm.a && a($$12).b()) {
            $$10 = -0.4;
         } else {
            $$10 = -0.9;
         }
      }

      fbs $$17 = new fbs($$5, $$6 + $$10, $$7);
      crr $$18 = crr.a($$3, $$17.d, $$17.e, $$17.f, this.d, bvl.o, $$1, null);
      if ($$18 != null) {
         $$3.b($$18);
         $$1.h(1);
      }

      return $$1;
   }

   private static dyq a(dxn $$0) {
      return $$0.b() instanceof djt $$1 ? $$0.c($$1.c()) : dyq.a;
   }

   @Override
   protected void a(ky $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
