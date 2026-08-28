@FunctionalInterface
public interface hx<T> {
   void execute(T var1, ht<T> var2, hv var3);

   default hs<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
