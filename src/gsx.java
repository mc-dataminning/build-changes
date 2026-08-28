public abstract class gsx<S extends gvd, M extends fza<S>> extends gtn<S, M> {
   public gsx(gqw<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(fek $$0, gix $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.p;
         M $$7 = this.c();
         feo $$8 = $$1.getBuffer(gjh.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, gyk.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract all a();

   protected abstract M c();
}
