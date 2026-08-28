public abstract class gog<T extends bsr & bub, M extends fvk<T>> extends gov<T, M> {
   public gog(gmf<T, M> $$0) {
      super($$0);
   }

   @Override
   public void a(fbi $$0, gez $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.a()) {
         float $$10 = (float)$$3.ai + $$6;
         fvk<T> $$11 = this.b();
         $$11.a($$3, $$4, $$5, $$6);
         this.c().a($$11);
         fbm $$12 = $$1.getBuffer(gfh.b(this.a(), this.a($$10) % 1.0F, $$10 * 0.01F % 1.0F));
         $$11.a($$3, $$4, $$5, $$7, $$8, $$9);
         $$11.a($$0, $$12, $$2, gqc.d, -8355712);
      }
   }

   protected abstract float a(float var1);

   protected abstract akr a();

   protected abstract fvk<T> b();
}
