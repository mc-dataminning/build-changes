@FunctionalInterface
public interface hk<T> {
   void execute(T var1, hg<T> var2, hi var3);

   default hf<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
