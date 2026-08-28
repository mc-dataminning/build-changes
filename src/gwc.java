public abstract class gwc<S extends gyk, M extends gcb<S>> extends gwt<S, M> {
   public gwc(gub<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(ffu $$0, gly $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.u;
         M $$7 = this.c();
         ffy $$8 = $$1.getBuffer(gmi.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, hei.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract akv a();

   protected abstract M c();
}
