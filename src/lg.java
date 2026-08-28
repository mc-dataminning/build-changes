public class lg extends ld {
   private final ld c = new ld();
   private final bwb<? extends csh> d;

   public lg(bwb<? extends csh> $$0) {
      this.d = $$0;
   }

   @Override
   public cxy a(lb $$0, cxy $$1) {
      jo $$2 = $$0.d().c(dna.b);
      arn $$3 = $$0.b();
      fcu $$4 = $$0.a();
      double $$5 = $$4.a() + (double)$$2.j() * 1.125;
      double $$6 = Math.floor($$4.b()) + (double)$$2.k();
      double $$7 = $$4.c() + (double)$$2.l() * 1.125;
      jj $$8 = $$0.c().a($$2);
      dym $$9 = $$3.a_($$8);
      double $$10;
      if ($$9.a(awz.P)) {
         if (a($$9).b()) {
            $$10 = 0.6;
         } else {
            $$10 = 0.1;
         }
      } else {
         if (!$$9.l()) {
            return this.c.dispense($$0, $$1);
         }

         dym $$12 = $$3.a_($$8.e());
         if (!$$12.a(awz.P)) {
            return this.c.dispense($$0, $$1);
         }

         if ($$2 != jo.a && a($$12).b()) {
            $$10 = -0.4;
         } else {
            $$10 = -0.9;
         }
      }

      fcu $$17 = new fcu($$5, $$6 + $$10, $$7);
      csh $$18 = csh.a($$3, $$17.d, $$17.e, $$17.f, this.d, bwa.o, $$1, null);
      if ($$18 != null) {
         $$3.b($$18);
         $$1.h(1);
      }

      return $$1;
   }

   private static dzq a(dym $$0) {
      return $$0.b() instanceof dkj $$1 ? $$0.c($$1.c()) : dzq.a;
   }

   @Override
   protected void a(lb $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
