public class le extends lb {
   private final lb c = new lb();
   private final buq<? extends cqu> d;

   public le(buq<? extends cqu> $$0) {
      this.d = $$0;
   }

   @Override
   public cwn a(kz $$0, cwn $$1) {
      jn $$2 = $$0.d().c(dlq.b);
      arc $$3 = $$0.b();
      fay $$4 = $$0.a();
      double $$5 = $$4.a() + (double)$$2.j() * 1.125;
      double $$6 = Math.floor($$4.b()) + (double)$$2.k();
      double $$7 = $$4.c() + (double)$$2.l() * 1.125;
      ji $$8 = $$0.c().a($$2);
      dwv $$9 = $$3.a_($$8);
      double $$10;
      if ($$9.a(awo.P)) {
         if (a($$9).b()) {
            $$10 = 0.6;
         } else {
            $$10 = 0.1;
         }
      } else {
         if (!$$9.l()) {
            return this.c.dispense($$0, $$1);
         }

         dwv $$12 = $$3.a_($$8.e());
         if (!$$12.a(awo.P)) {
            return this.c.dispense($$0, $$1);
         }

         if ($$2 != jn.a && a($$12).b()) {
            $$10 = -0.4;
         } else {
            $$10 = -0.9;
         }
      }

      fay $$17 = new fay($$5, $$6 + $$10, $$7);
      cqu $$18 = cqu.a($$3, $$17.d, $$17.e, $$17.f, this.d, bup.o, $$1, null);
      if ($$18 != null) {
         $$3.b($$18);
         $$1.h(1);
      }

      return $$1;
   }

   private static dxy a(dwv $$0) {
      return $$0.b() instanceof diz $$1 ? $$0.c($$1.c()) : dxy.a;
   }

   @Override
   protected void a(kz $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
