public abstract class gpf<T extends bux, S extends gva, M extends fxz<? super S>> extends gpa<T, S, M> {
   public gpf(gnz.a $$0, M $$1, float $$2) {
      super($$0, $$1, $$2);
   }

   protected boolean a(T $$0, double $$1) {
      return super.a($$0, $$1) && ($$0.cN() || $$0.am() && $$0 == this.e.c);
   }

   @Override
   protected float g(S $$0) {
      return super.g($$0) * $$0.ab;
   }
}
