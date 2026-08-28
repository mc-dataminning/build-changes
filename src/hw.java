@FunctionalInterface
public interface hw<T> {
   void execute(T var1, hs<T> var2, hu var3);

   default hr<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
