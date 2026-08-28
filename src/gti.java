public abstract class gti<S extends gvo, M extends fzj<S>> extends gty<S, M> {
   public gti(grh<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(fer $$0, gjg $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.p;
         M $$7 = this.c();
         fev $$8 = $$1.getBuffer(gjq.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, gyv.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract alj a();

   protected abstract M c();
}
