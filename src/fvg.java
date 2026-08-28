import java.util.function.Function;

public abstract class fvg<E extends bsg> extends fuo<E> {
   public fvg() {
      this(gel::e);
   }

   public fvg(Function<akk, gel> $$0) {
      super($$0);
   }

   @Override
   public void a(fam $$0, faq $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fxo> d();
}
