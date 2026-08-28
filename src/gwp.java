@Deprecated
public abstract class gwp<T extends byh, S extends hfe, M extends ghn<? super S>> extends gzb<T, S, M> {
   private final M a;
   private final M j;

   public gwp(gxv.a $$0, M $$1, M $$2, float $$3) {
      super($$0, $$1, $$3);
      this.a = $$1;
      this.j = $$2;
   }

   @Override
   public void a(S $$0, fld $$1, grn $$2, int $$3) {
      this.g = $$0.am ? this.j : this.a;
      super.a($$0, $$1, $$2, $$3);
   }
}
