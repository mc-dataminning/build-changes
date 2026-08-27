public abstract class jj extends jm {
   @Override
   public cpq a(jk $$0, cpq $$1) {
      cwe $$2 = $$0.b();
      iv $$3 = dbk.a($$0);
      ih $$4 = $$0.d().c(dbk.b);
      cis $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(jk $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract cis a(cwe var1, iv var2, cpq var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
