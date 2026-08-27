public abstract class jv extends jy {
   @Override
   public crs a(jw $$0, crs $$1) {
      czg $$2 = $$0.b();
      ix $$3 = dem.a($$0);
      ij $$4 = $$0.d().c(dem.b);
      cks $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.g(1);
      return $$1;
   }

   @Override
   protected void a(jw $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract cks a(czg var1, ix var2, crs var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
