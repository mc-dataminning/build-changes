public abstract class ig extends ii {
   @Override
   public cja a(gx $$0, cja $$1) {
      cpq $$2 = $$0.g();
      hq $$3 = cur.a($$0);
      hc $$4 = $$0.e().c(cur.a);
      cch $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(gx $$0) {
      $$0.g().c(1002, $$0.d(), 0);
   }

   protected abstract cch a(cpq var1, hq var2, cja var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
