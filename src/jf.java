public abstract class jf extends ji {
   @Override
   public cmx a(jg $$0, cmx $$1) {
      cto $$2 = $$0.b();
      ir $$3 = cyu.a($$0);
      ic $$4 = $$0.d().c(cyu.b);
      cfz $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(jg $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract cfz a(cto var1, ir var2, cmx var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
