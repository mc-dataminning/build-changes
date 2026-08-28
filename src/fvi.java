import java.util.function.Function;

public abstract class fvi<E extends bsh> extends fuq<E> {
   public fvi() {
      this(gen::e);
   }

   public fvi(Function<akk, gen> $$0) {
      super($$0);
   }

   @Override
   public void a(fao $$0, fas $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fxq> d();
}
