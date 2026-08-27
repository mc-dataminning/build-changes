public abstract class jh extends jk {
   @Override
   public coz a(ji $$0, coz $$1) {
      cvn $$2 = $$0.b();
      it $$3 = dat.a($$0);
      ie $$4 = $$0.d().c(dat.b);
      chz $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(ji $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract chz a(cvn var1, it var2, coz var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
