public abstract class ic extends ig {
   @Override
   public cjf a(id $$0, cjf $$1) {
      cpv $$2 = $$0.b();
      ho $$3 = cuw.a($$0);
      ha $$4 = $$0.d().c(cuw.a);
      ccm $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(id $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract ccm a(cpv var1, ho var2, cjf var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
