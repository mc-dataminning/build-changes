@FunctionalInterface
public interface hz<T> {
   void execute(T var1, hv<T> var2, hx var3);

   default hu<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
