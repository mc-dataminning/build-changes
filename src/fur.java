import java.util.function.Function;

public abstract class fur<E extends bst> extends ftz<E> {
   public fur() {
      this(gdv::e);
   }

   public fur(Function<ale, gdv> $$0) {
      super($$0);
   }

   @Override
   public void a(ezx $$0, fab $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fwz> d();
}
