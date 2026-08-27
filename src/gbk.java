public abstract class gbk<T extends blf & bmi, M extends fiy<T>> extends gbz<T, M> {
   public gbk(fzj<T, M> $$0) {
      super($$0);
   }

   @Override
   public void a(epd $$0, fsi $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.a()) {
         float $$10 = (float)$$3.ah + $$6;
         fiy<T> $$11 = this.b();
         $$11.a($$3, $$4, $$5, $$6);
         this.c().a($$11);
         eph $$12 = $$1.getBuffer(fsq.b(this.a($$3), this.a($$10) % 1.0F, this.b($$10) % 1.0F));
         $$11.a($$3, $$4, $$5, $$7, $$8, $$9);
         $$11.a($$0, $$12, $$2, gdf.d, 0.5F, 0.5F, 0.5F, 1.0F);
      }
   }

   protected abstract float a(float var1);

   protected float b(float $$0) {
      return $$0 * 0.01F;
   }

   protected abstract agt a();

   protected abstract fiy<T> b();
}
