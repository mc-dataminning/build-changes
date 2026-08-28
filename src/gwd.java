public abstract class gwd<S extends gyl, M extends gcc<S>> extends gwu<S, M> {
   public gwd(guc<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(ffv $$0, glz $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.u;
         M $$7 = this.c();
         ffz $$8 = $$1.getBuffer(gmj.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, hej.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract akv a();

   protected abstract M c();
}
