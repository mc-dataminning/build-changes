import java.util.function.Function;

public abstract class fut<E extends bsv> extends fub<E> {
   public fut() {
      this(gdx::e);
   }

   public fut(Function<alf, gdx> $$0) {
      super($$0);
   }

   @Override
   public void a(ezz $$0, fad $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fxb> d();
}
