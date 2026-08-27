public abstract class jk extends jn {
   @Override
   public cqk a(jl $$0, cqk $$1) {
      cwz $$2 = $$0.b();
      iv $$3 = dcf.a($$0);
      ih $$4 = $$0.d().c(dcf.b);
      cjk $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(jl $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract cjk a(cwz var1, iv var2, cqk var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
