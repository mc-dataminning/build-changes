public class jx extends jy {
   private final jy c = new jy();
   private final clx.b d;
   private final boolean e;

   public jx(clx.b $$0) {
      this($$0, false);
   }

   public jx(clx.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public crs a(jw $$0, crs $$1) {
      ij $$2 = $$0.d().c(dem.b);
      apu $$3 = $$0.b();
      esj $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bqg.k.k() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      id $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(avj.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).i() || !$$3.b_($$9.d()).a(avj.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      clx $$13 = (clx)(this.e ? new cly($$3, $$6, $$7 + $$10, $$8) : new clx($$3, $$6, $$7 + $$10, $$8));
      bqg.<clx>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.r($$2.p());
      $$3.b($$13);
      $$1.g(1);
      return $$1;
   }

   @Override
   protected void a(jw $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
