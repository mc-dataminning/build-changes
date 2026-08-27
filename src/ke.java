public abstract class ke extends kh {
   @Override
   public csz a(kf $$0, csz $$1) {
      dad $$2 = $$0.b();
      jg $$3 = dfj.a($$0);
      is $$4 = $$0.d().c(dfj.b);
      clz $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kf $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract clz a(dad var1, jg var2, csz var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
