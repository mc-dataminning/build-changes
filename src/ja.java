public abstract class ja extends jd {
   @Override
   public clj a(jb $$0, clj $$1) {
      csa $$2 = $$0.b();
      im $$3 = cxf.a($$0);
      hx $$4 = $$0.d().c(cxf.b);
      cem $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(jb $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract cem a(csa var1, im var2, clj var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
