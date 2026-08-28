public class lk extends lh {
   private final lh c = new lh();
   private final bxe<? extends cum> d;

   public lk(bxe<? extends cum> $$0) {
      this.d = $$0;
   }

   @Override
   public daa a(lf $$0, daa $$1) {
      jc $$2 = $$0.d().c(dpk.b);
      aru $$3 = $$0.b();
      ffs $$4 = $$0.a();
      double $$5 = $$4.a() + (double)$$2.j() * 1.125;
      double $$6 = Math.floor($$4.b()) + (double)$$2.k();
      double $$7 = $$4.c() + (double)$$2.l() * 1.125;
      iw $$8 = $$0.c().a($$2);
      ebg $$9 = $$3.a_($$8);
      double $$10;
      if ($$9.a(axg.P)) {
         if (a($$9).b()) {
            $$10 = 0.6;
         } else {
            $$10 = 0.1;
         }
      } else {
         if (!$$9.l()) {
            return this.c.dispense($$0, $$1);
         }

         ebg $$12 = $$3.a_($$8.e());
         if (!$$12.a(axg.P)) {
            return this.c.dispense($$0, $$1);
         }

         if ($$2 != jc.a && a($$12).b()) {
            $$10 = -0.4;
         } else {
            $$10 = -0.9;
         }
      }

      ffs $$17 = new ffs($$5, $$6 + $$10, $$7);
      cum $$18 = cum.a($$3, $$17.d, $$17.e, $$17.f, this.d, bxd.o, $$1, null);
      if ($$18 != null) {
         $$3.b($$18);
         $$1.h(1);
      }

      return $$1;
   }

   private static eck a(ebg $$0) {
      return $$0.b() instanceof dmt $$1 ? $$0.c($$1.c()) : eck.a;
   }

   @Override
   protected void a(lf $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
