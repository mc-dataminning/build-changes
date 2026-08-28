public abstract class goe<T extends bsr & bub, M extends fvi<T>> extends got<T, M> {
   public goe(gmd<T, M> $$0) {
      super($$0);
   }

   @Override
   public void a(fbg $$0, gex $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.a()) {
         float $$10 = (float)$$3.ai + $$6;
         fvi<T> $$11 = this.b();
         $$11.a($$3, $$4, $$5, $$6);
         this.c().a($$11);
         fbk $$12 = $$1.getBuffer(gff.b(this.a(), this.a($$10) % 1.0F, $$10 * 0.01F % 1.0F));
         $$11.a($$3, $$4, $$5, $$7, $$8, $$9);
         $$11.a($$0, $$12, $$2, gqa.d, -8355712);
      }
   }

   protected abstract float a(float var1);

   protected abstract akr a();

   protected abstract fvi<T> b();
}
