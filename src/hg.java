@FunctionalInterface
public interface hg<T> {
   void execute(T var1, hc<T> var2, he var3);

   default hb<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
