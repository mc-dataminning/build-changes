public abstract class gtk<T extends bvj, S extends gzk, M extends gcb<? super S>> extends gtf<T, S, M> {
   public gtk(gse.a $$0, M $$1, float $$2) {
      super($$0, $$1, $$2);
   }

   protected boolean a(T $$0, double $$1) {
      return super.a($$0, $$1) && ($$0.cM() || $$0.l_() && $$0 == this.e.c);
   }

   @Override
   protected float g(S $$0) {
      return super.g($$0) * $$0.ag;
   }
}
