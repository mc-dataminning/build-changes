public abstract class ie extends ih {
   @Override
   public ciw a(gw $$0, ciw $$1) {
      cpk $$2 = $$0.g();
      hp $$3 = cul.a($$0);
      hb $$4 = $$0.e().c(cul.a);
      ccd $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(gw $$0) {
      $$0.g().c(1002, $$0.d(), 0);
   }

   protected abstract ccd a(cpk var1, hp var2, ciw var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
