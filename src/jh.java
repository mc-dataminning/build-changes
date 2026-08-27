public abstract class jh extends jk {
   @Override
   public cpd a(ji $$0, cpd $$1) {
      cvr $$2 = $$0.b();
      it $$3 = dax.a($$0);
      ie $$4 = $$0.d().c(dax.b);
      cid $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(ji $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract cid a(cvr var1, it var2, cpd var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
