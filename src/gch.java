public abstract class gch<T extends blu & bmx, M extends fjv<T>> extends gcw<T, M> {
   public gch(gag<T, M> $$0) {
      super($$0);
   }

   @Override
   public void a(epz $$0, ftf $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.a()) {
         float $$10 = (float)$$3.ah + $$6;
         fjv<T> $$11 = this.b();
         $$11.a($$3, $$4, $$5, $$6);
         this.c().a($$11);
         eqd $$12 = $$1.getBuffer(ftn.b(this.a(), this.a($$10) % 1.0F, $$10 * 0.01F % 1.0F));
         $$11.a($$3, $$4, $$5, $$7, $$8, $$9);
         $$11.a($$0, $$12, $$2, gec.d, 0.5F, 0.5F, 0.5F, 1.0F);
      }
   }

   protected abstract float a(float var1);

   protected abstract ahg a();

   protected abstract fjv<T> b();
}
