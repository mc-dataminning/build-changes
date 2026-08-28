@FunctionalInterface
public interface hy<T> {
   void execute(T var1, hu<T> var2, hw var3);

   default ht<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
