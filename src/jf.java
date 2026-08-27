public class jf extends jg {
   private final jg c = new jg();
   private final cgl.b d;
   private final boolean e;

   public jf(cgl.b $$0) {
      this($$0, false);
   }

   public jf(cgl.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cmh a(je $$0, cmh $$1) {
      ia $$2 = $$0.d().c(cye.b);
      amp $$3 = $$0.b();
      elb $$4 = $$0.a();
      double $$5 = 0.5625 + (double)blj.k.k() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      hv $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(arw.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(arw.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cgl $$13 = (cgl)(this.e ? new cgm($$3, $$6, $$7 + $$10, $$8) : new cgl($$3, $$6, $$7 + $$10, $$8));
      blj.<cgl>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.r($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(je $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
