public abstract class jt extends jw {
   @Override
   public crj a(ju $$0, crj $$1) {
      cyx $$2 = $$0.b();
      iv $$3 = ded.a($$0);
      ih $$4 = $$0.d().c(ded.b);
      ckl $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.g(1);
      return $$1;
   }

   @Override
   protected void a(ju $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract ckl a(cyx var1, iv var2, crj var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
