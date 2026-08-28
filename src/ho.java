@FunctionalInterface
public interface ho<T> {
   void execute(T var1, hk<T> var2, hm var3);

   default hj<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
