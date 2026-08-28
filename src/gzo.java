public abstract class gzo<T extends bxw, S extends hfp, M extends gia<? super S>> extends gzj<T, S, M> {
   public gzo(gyi.a $$0, M $$1, float $$2) {
      super($$0, $$1, $$2);
   }

   protected boolean a(T $$0, double $$1) {
      return super.a($$0, $$1) && ($$0.cM() || $$0.h_() && $$0 == this.d.c);
   }

   @Override
   protected float g(S $$0) {
      return super.g($$0) * $$0.ag;
   }
}
