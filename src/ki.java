public abstract class ki extends kl {
   @Override
   public cuh a(kj $$0, cuh $$1) {
      dca $$2 = $$0.b();
      jk $$3 = dhi.a($$0);
      iw $$4 = $$0.d().c(dhi.b);
      cms $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kj $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract cms a(dca var1, jk var2, cuh var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
