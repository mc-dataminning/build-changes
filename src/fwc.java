import java.util.function.Function;

public abstract class fwc<E extends bsr> extends fvk<E> {
   public fwc() {
      this(gfh::e);
   }

   public fwc(Function<akr, gfh> $$0) {
      super($$0);
   }

   @Override
   public void a(fbi $$0, fbm $$1, int $$2, int $$3, int $$4) {
      this.d().forEach($$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public abstract Iterable<fyk> d();
}
