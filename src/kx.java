public class kx extends ky {
   private final ky c = new ky();
   private final cpx.b d;
   private final boolean e;

   public kx(cpx.b $$0) {
      this($$0, false);
   }

   public kx(cpx.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cvs a(kw $$0, cvs $$1) {
      jk $$2 = $$0.d().c(djr.b);
      arj $$3 = $$0.b();
      eyw $$4 = $$0.a();
      double $$5 = 0.5625 + (double)bty.k.l() / 2.0;
      double $$6 = $$4.a() + (double)$$2.j() * $$5;
      double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125F);
      double $$8 = $$4.c() + (double)$$2.l() * $$5;
      jf $$9 = $$0.c().a($$2);
      double $$10;
      if ($$3.b_($$9).a(axb.a)) {
         $$10 = 1.0;
      } else {
         if (!$$3.a_($$9).l() || !$$3.b_($$9.e()).a(axb.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$10 = 0.0;
      }

      cpx $$13 = (cpx)(this.e ? new cpy($$3, $$6, $$7 + $$10, $$8) : new cpx($$3, $$6, $$7 + $$10, $$8));
      bty.<cpx>a($$3, $$1, null).accept($$13);
      $$13.a(this.d);
      $$13.v($$2.p());
      $$3.b($$13);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kw $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
