@Deprecated
public abstract class gof<T extends bvj, S extends gwm, M extends fzj<? super S>> extends gqq<T, S, M> {
   private final M a;
   private final M b;

   public gof(gpk.a $$0, M $$1, M $$2, float $$3) {
      super($$0, $$1, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public void a(S $$0, fer $$1, gjg $$2, int $$3) {
      this.h = $$0.ae ? this.b : this.a;
      super.a($$0, $$1, $$2, $$3);
   }
}
