@Deprecated
public abstract class gqx<T extends bvi, S extends gzj, M extends gca<? super S>> extends gtj<T, S, M> {
   private final M a;
   private final M b;

   public gqx(gsd.a $$0, M $$1, M $$2, float $$3) {
      super($$0, $$1, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public void a(S $$0, fft $$1, glx $$2, int $$3) {
      this.h = $$0.aj ? this.b : this.a;
      super.a($$0, $$1, $$2, $$3);
   }
}
