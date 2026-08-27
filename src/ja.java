public abstract class ja extends jd {
   @Override
   public ckj a(jb $$0, ckj $$1) {
      cqz $$2 = $$0.b();
      im $$3 = cwd.a($$0);
      hx $$4 = $$0.d().c(cwd.b);
      cdp $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(jb $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract cdp a(cqz var1, im var2, ckj var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
