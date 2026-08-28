public abstract class gyd<S extends hak, M extends gea<S>> extends gyt<S, M> {
   public gyd(gwc<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(fho $$0, gny $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.u;
         M $$7 = this.c();
         fhs $$8 = $$1.getBuffer(goi.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, hgi.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract ald a();

   protected abstract M c();
}
