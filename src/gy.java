@FunctionalInterface
public interface gy<T> {
   void execute(T var1, gu<T> var2, gw var3);

   default gt<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
