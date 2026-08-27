public abstract class ig extends ii {
   @Override
   public cjh a(gx $$0, cjh $$1) {
      cpx $$2 = $$0.g();
      hq $$3 = cuy.a($$0);
      hc $$4 = $$0.e().c(cuy.a);
      cco $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(gx $$0) {
      $$0.g().c(1002, $$0.d(), 0);
   }

   protected abstract cco a(cpx var1, hq var2, cjh var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
