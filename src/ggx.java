public abstract class ggx<T extends box & bqb, M extends foe<T>> extends ghm<T, M> {
   public ggx(gew<T, M> $$0) {
      super($$0);
   }

   @Override
   public void a(eub $$0, fxs $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.a()) {
         float $$10 = (float)$$3.ah + $$6;
         foe<T> $$11 = this.b();
         $$11.a($$3, $$4, $$5, $$6);
         this.c().a($$11);
         euf $$12 = $$1.getBuffer(fya.b(this.a(), this.a($$10) % 1.0F, $$10 * 0.01F % 1.0F));
         $$11.a($$3, $$4, $$5, $$7, $$8, $$9);
         $$11.a($$0, $$12, $$2, git.d, 0.5F, 0.5F, 0.5F, 1.0F);
      }
   }

   protected abstract float a(float var1);

   protected abstract ajh a();

   protected abstract foe<T> b();
}
