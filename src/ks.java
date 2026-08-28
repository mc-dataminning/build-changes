public class ks extends kt {
   private final kt c = new kt();
   private final coi.b d;
   private final boolean e;

   public ks(coi.b $$0) {
      this($$0, false);
   }

   public ks(coi.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cud a(kr $$0, cud $$1) {
      jf $$2 = $$0.d().c(dhn.b);
      aqm $$3 = $$0.b();
      ewh $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bsn.k.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      ja $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(awc.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(awc.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      coi $$13 = (coi)(this.e ? new coj($$3, $$6, $$7 + $$10, $$8) : new coi($$3, $$6, $$7 + $$10, $$8));
      bsn.<coi>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.s($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kr $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
