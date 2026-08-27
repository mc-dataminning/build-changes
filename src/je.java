public abstract class je extends jh {
   @Override
   public clo a(jf $$0, clo $$1) {
      csf $$2 = $$0.b();
      iq $$3 = cxk.a($$0);
      ib $$4 = $$0.d().c(cxk.b);
      cer $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(jf $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract cer a(csf var1, iq var2, clo var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
