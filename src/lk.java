public class lk extends lh {
   private final lh c = new lh();
   private final bxn<? extends cuv> d;

   public lk(bxn<? extends cuv> $$0) {
      this.d = $$0;
   }

   @Override
   public dak a(lf $$0, dak $$1) {
      jc $$2 = $$0.d().c(dpu.b);
      asb $$3 = $$0.b();
      fgc $$4 = $$0.a();
      double $$5 = $$4.a() + (double)$$2.j() * 1.125;
      double $$6 = Math.floor($$4.b()) + (double)$$2.k();
      double $$7 = $$4.c() + (double)$$2.l() * 1.125;
      iw $$8 = $$0.c().a($$2);
      ebq $$9 = $$3.a_($$8);
      double $$10;
      if ($$9.a(axn.P)) {
         if (a($$9).b()) {
            $$10 = 0.6;
         } else {
            $$10 = 0.1;
         }
      } else {
         if (!$$9.l()) {
            return this.c.dispense($$0, $$1);
         }

         ebq $$12 = $$3.a_($$8.e());
         if (!$$12.a(axn.P)) {
            return this.c.dispense($$0, $$1);
         }

         if ($$2 != jc.a && a($$12).b()) {
            $$10 = -0.4;
         } else {
            $$10 = -0.9;
         }
      }

      fgc $$17 = new fgc($$5, $$6 + $$10, $$7);
      cuv $$18 = cuv.a($$3, $$17.d, $$17.e, $$17.f, this.d, bxm.o, $$1, null);
      if ($$18 != null) {
         $$3.b($$18);
         $$1.h(1);
      }

      return $$1;
   }

   private static ecu a(ebq $$0) {
      return $$0.b() instanceof dnd $$1 ? $$0.c($$1.c()) : ecu.a;
   }

   @Override
   protected void a(lf $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
