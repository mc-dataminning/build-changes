public abstract class gxf<T extends bxe, S extends hdf, M extends gfq<? super S>> extends gxa<T, S, M> {
   public gxf(gvz.a $$0, M $$1, float $$2) {
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
