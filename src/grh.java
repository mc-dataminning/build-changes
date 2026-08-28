public abstract class grh<S extends gtl, M extends fxk<S>> extends grw<S, M> {
   public grh(gpf<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(fde $$0, ghg $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.p;
         M $$7 = this.c();
         fdi $$8 = $$1.getBuffer(ghq.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, gws.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract alc a();

   protected abstract M c();
}
