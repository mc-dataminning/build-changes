import java.util.function.Function;

public abstract class fvw<E extends bsq> extends fve<E> {
   public fvw() {
      this(gfb::e);
   }

   public fvw(Function<akq, gfb> $$0) {
      super($$0);
   }

   @Override
   public void a(fbc $$0, fbg $$1, int $$2, int $$3, int $$4) {
      this.d().forEach($$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public abstract Iterable<fye> d();
}
