public abstract class gsh<S extends gun, M extends fyk<S>> extends gsx<S, M> {
   public gsh(gqg<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(feb $$0, gih $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.p;
         M $$7 = this.c();
         fef $$8 = $$1.getBuffer(gir.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, gxu.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract ali a();

   protected abstract M c();
}
