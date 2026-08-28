@FunctionalInterface
public interface hn<T> {
   void execute(T var1, hj<T> var2, hl var3);

   default hi<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
