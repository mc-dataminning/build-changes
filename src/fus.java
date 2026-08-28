import java.util.function.Function;

public abstract class fus<E extends bsu> extends fua<E> {
   public fus() {
      this(gdw::e);
   }

   public fus(Function<alf, gdw> $$0) {
      super($$0);
   }

   @Override
   public void a(ezy $$0, fac $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fxa> d();
}
