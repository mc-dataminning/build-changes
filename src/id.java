public abstract class id extends ig {
   @Override
   public cfz a(gv $$0, cfz $$1) {
      cmm $$2 = $$0.g();
      ho $$3 = cro.a($$0);
      ha $$4 = $$0.e().c(cro.a);
      bzg $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(gv $$0) {
      $$0.g().c(1002, $$0.d(), 0);
   }

   protected abstract bzg a(cmm var1, ho var2, cfz var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
