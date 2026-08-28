public abstract class gvn<S extends gxu, M extends gbl<S>> extends gwe<S, M> {
   public gvn(gtm<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(fgr $$0, glk $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.p;
         M $$7 = this.c();
         fgv $$8 = $$1.getBuffer(glu.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, hbb.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract alz a();

   protected abstract M c();
}
