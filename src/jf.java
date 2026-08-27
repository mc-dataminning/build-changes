public abstract class jf extends ji {
   @Override
   public cng a(jg $$0, cng $$1) {
      ctx $$2 = $$0.b();
      ir $$3 = czd.a($$0);
      ic $$4 = $$0.d().c(czd.b);
      cgi $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(jg $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract cgi a(ctx var1, ir var2, cng var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
