@FunctionalInterface
public interface hh<T> {
   void execute(T var1, hd<T> var2, hf var3);

   default hc<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
