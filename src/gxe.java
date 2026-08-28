@Deprecated
public abstract class gxe<T extends bxy, S extends hfr, M extends gic<? super S>> extends gzq<T, S, M> {
   private final M a;
   private final M j;

   public gxe(gyk.a $$0, M $$1, M $$2, float $$3) {
      super($$0, $$1, $$3);
      this.a = $$1;
      this.j = $$2;
   }

   @Override
   public void a(S $$0, flq $$1, gsc $$2, int $$3) {
      this.g = $$0.aj ? this.j : this.a;
      super.a($$0, $$1, $$2, $$3);
   }
}
