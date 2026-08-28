@Deprecated
public abstract class gmu<T extends bux, S extends gva, M extends fxz<? super S>> extends gpf<T, S, M> {
   private final M a;
   private final M b;

   public gmu(gnz.a $$0, M $$1, M $$2, float $$3) {
      super($$0, $$1, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public void a(S $$0, fdt $$1, ghw $$2, int $$3) {
      this.h = $$0.ae ? this.b : this.a;
      super.a($$0, $$1, $$2, $$3);
   }
}
