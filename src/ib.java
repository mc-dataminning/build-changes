@FunctionalInterface
public interface ib<T> {
   void execute(T var1, hx<T> var2, hz var3);

   default hw<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
