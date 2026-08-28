@Deprecated
public abstract class gvb<T extends bxg, S extends hdn, M extends gfy<? super S>> extends gxn<T, S, M> {
   private final M a;
   private final M j;

   public gvb(gwh.a $$0, M $$1, M $$2, float $$3) {
      super($$0, $$1, $$3);
      this.a = $$1;
      this.j = $$2;
   }

   @Override
   public void a(S $$0, fjj $$1, gqa $$2, int $$3) {
      this.g = $$0.aj ? this.j : this.a;
      super.a($$0, $$1, $$2, $$3);
   }
}
