public class jv extends jw {
   private final jw c = new jw();
   private final clq.b d;
   private final boolean e;

   public jv(clq.b $$0) {
      this($$0, false);
   }

   public jv(clq.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public crj a(ju $$0, crj $$1) {
      ih $$2 = $$0.d().c(ded.b);
      aps $$3 = $$0.b();
      esa $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bqb.k.k() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      ib $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(avh.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(avh.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      clq $$13 = (clq)(this.e ? new clr($$3, $$6, $$7 + $$10, $$8) : new clq($$3, $$6, $$7 + $$10, $$8));
      bqb.<clq>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.r($$2.p());
      $$3.b($$13);
      $$1.g(1);
      return $$1;
   }

   @Override
   protected void a(ju $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
