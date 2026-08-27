public abstract class gcb<T extends blp & bms, M extends fjp<T>> extends gcq<T, M> {
   public gcb(gaa<T, M> $$0) {
      super($$0);
   }

   @Override
   public void a(ept $$0, fsz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.a()) {
         float $$10 = (float)$$3.ah + $$6;
         fjp<T> $$11 = this.b();
         $$11.a($$3, $$4, $$5, $$6);
         this.c().a($$11);
         epx $$12 = $$1.getBuffer(fth.b(this.a($$3), this.a($$10) % 1.0F, this.b($$10) % 1.0F));
         $$11.a($$3, $$4, $$5, $$7, $$8, $$9);
         $$11.a($$0, $$12, $$2, gdw.d, 0.5F, 0.5F, 0.5F, 1.0F);
      }
   }

   protected abstract float a(float var1);

   protected float b(float $$0) {
      return $$0 * 0.01F;
   }

   protected abstract ahd a();

   protected abstract fjp<T> b();
}
