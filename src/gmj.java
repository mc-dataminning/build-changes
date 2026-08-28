@Deprecated
public abstract class gmj<T extends bup, S extends guo, M extends fxo<? super S>> extends gou<T, S, M> {
   private final M a;
   private final M b;

   public gmj(gno.a $$0, M $$1, M $$2, float $$3) {
      super($$0, $$1, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public void a(S $$0, fdi $$1, ghl $$2, int $$3) {
      this.h = $$0.ae ? this.b : this.a;
      super.a($$0, $$1, $$2, $$3);
   }
}
