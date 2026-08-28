public abstract class goa<T extends bsq & btz, M extends fve<T>> extends gop<T, M> {
   public goa(glz<T, M> $$0) {
      super($$0);
   }

   @Override
   public void a(fbc $$0, get $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.a()) {
         float $$10 = (float)$$3.ai + $$6;
         fve<T> $$11 = this.b();
         $$11.a($$3, $$4, $$5, $$6);
         this.c().a($$11);
         fbg $$12 = $$1.getBuffer(gfb.b(this.a(), this.a($$10) % 1.0F, $$10 * 0.01F % 1.0F));
         $$11.a($$3, $$4, $$5, $$7, $$8, $$9);
         $$11.a($$0, $$12, $$2, gpw.d, -8355712);
      }
   }

   protected abstract float a(float var1);

   protected abstract akq a();

   protected abstract fve<T> b();
}
