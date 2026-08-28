public abstract class hbt<S extends hec, M extends ghn<S>> extends hcj<S, M> {
   public hbt(gzs<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(fld $$0, grn $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.v;
         M $$7 = this.c();
         flg $$8 = $$1.getBuffer(gry.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, hkg.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract alr a();

   protected abstract M c();
}
