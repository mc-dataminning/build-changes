public abstract class gvz<S extends gyh, M extends gby<S>> extends gwq<S, M> {
   public gvz(gty<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(ffs $$0, glv $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.u;
         M $$7 = this.c();
         ffw $$8 = $$1.getBuffer(gmf.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, hec.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract aku a();

   protected abstract M c();
}
