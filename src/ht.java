@FunctionalInterface
public interface ht<T> {
   void execute(T var1, hp<T> var2, hr var3);

   default ho<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
