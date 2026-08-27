public class kg extends kh {
   private final kh c = new kh();
   private final cnt.b d;
   private final boolean e;

   public kg(cnt.b $$0) {
      this($$0, false);
   }

   public kg(cnt.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cto a(kf $$0, cto $$1) {
      it $$2 = $$0.d().c(dgd.b);
      aqm $$3 = $$0.b();
      euk $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bsa.k.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      io $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(awb.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(awb.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cnt $$13 = (cnt)(this.e ? new cnu($$3, $$6, $$7 + $$10, $$8) : new cnt($$3, $$6, $$7 + $$10, $$8));
      bsa.<cnt>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.r($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kf $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
