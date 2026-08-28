public class la extends lb {
   private final lb c = new lb();
   private final bvi<? extends cro> d;

   public la(bvi<? extends cro> $$0) {
      this.d = $$0;
   }

   @Override
   public cxh a(kz $$0, cxh $$1) {
      jn $$2 = $$0.d().c(dmk.b);
      ard $$3 = $$0.b();
      fbx $$4 = $$0.a();
      double $$5 = 0.5625 + (double)this.d.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      ji $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(awv.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).l() || !$$3.b_($$9.e()).a(awv.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cro $$13 = this.d.a($$3, bvh.o);
      if ($$13 != null) {
         $$13.p($$6, $$7 + $$10, $$8);
         bvi.<cro>a($$3, $$1, null).accept($$13);
         $$13.w($$2.p());
         $$3.b($$13);
         $$1.h(1);
      }

      return $$1;
   }

   @Override
   protected void a(kz $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
