public abstract class haw<S extends hdf, M extends ggp<S>> extends hbm<S, M> {
   public haw(gyv<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(fkd $$0, gqr $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.u;
         M $$7 = this.c();
         fkh $$8 = $$1.getBuffer(grc.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, hjg.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract alg a();

   protected abstract M c();
}
