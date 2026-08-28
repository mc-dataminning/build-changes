import java.util.function.Function;

public abstract class fva<E extends bsd> extends fui<E> {
   public fva() {
      this(gef::e);
   }

   public fva(Function<akk, gef> $$0) {
      super($$0);
   }

   @Override
   public void a(fag $$0, fak $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fxi> d();
}
