public class lj extends lg {
   private final lg c = new lg();
   private final bxc<? extends cuk> d;

   public lj(bxc<? extends cuk> $$0) {
      this.d = $$0;
   }

   @Override
   public czy a(le $$0, czy $$1) {
      jb $$2 = $$0.d().c(dpi.b);
      ars $$3 = $$0.b();
      ffq $$4 = $$0.a();
      double $$5 = $$4.a() + (double)$$2.j() * 1.125;
      double $$6 = Math.floor($$4.b()) + (double)$$2.k();
      double $$7 = $$4.c() + (double)$$2.l() * 1.125;
      iv $$8 = $$0.c().a($$2);
      ebe $$9 = $$3.a_($$8);
      double $$10;
      if ($$9.a(axe.P)) {
         if (a($$9).b()) {
            $$10 = 0.6;
         } else {
            $$10 = 0.1;
         }
      } else {
         if (!$$9.l()) {
            return this.c.dispense($$0, $$1);
         }

         ebe $$12 = $$3.a_($$8.e());
         if (!$$12.a(axe.P)) {
            return this.c.dispense($$0, $$1);
         }

         if ($$2 != jb.a && a($$12).b()) {
            $$10 = -0.4;
         } else {
            $$10 = -0.9;
         }
      }

      ffq $$17 = new ffq($$5, $$6 + $$10, $$7);
      cuk $$18 = cuk.a($$3, $$17.d, $$17.e, $$17.f, this.d, bxb.o, $$1, null);
      if ($$18 != null) {
         $$3.b($$18);
         $$1.h(1);
      }

      return $$1;
   }

   private static eci a(ebe $$0) {
      return $$0.b() instanceof dmr $$1 ? $$0.c($$1.c()) : eci.a;
   }

   @Override
   protected void a(le $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
