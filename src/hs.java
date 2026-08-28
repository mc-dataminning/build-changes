@FunctionalInterface
public interface hs<T> {
   void execute(T var1, ho<T> var2, hq var3);

   default hn<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
