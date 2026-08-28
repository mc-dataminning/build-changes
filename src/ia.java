@FunctionalInterface
public interface ia<T> {
   void execute(T var1, hw<T> var2, hy var3);

   default hv<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
