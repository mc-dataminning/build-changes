public abstract class gmw<T extends bsw & bue, M extends fuc<T>> extends gnl<T, M> {
   public gmw(gkv<T, M> $$0) {
      super($$0);
   }

   @Override
   public void a(faa $$0, gdq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.a()) {
         float $$10 = (float)$$3.ai + $$6;
         fuc<T> $$11 = this.b();
         $$11.a($$3, $$4, $$5, $$6);
         this.c().a($$11);
         fae $$12 = $$1.getBuffer(gdy.b(this.a(), this.a($$10) % 1.0F, $$10 * 0.01F % 1.0F));
         $$11.a($$3, $$4, $$5, $$7, $$8, $$9);
         $$11.a($$0, $$12, $$2, gos.d, 0.5F, 0.5F, 0.5F, 1.0F);
      }
   }

   protected abstract float a(float var1);

   protected abstract alf a();

   protected abstract fuc<T> b();
}
