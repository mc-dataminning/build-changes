@FunctionalInterface
public interface gq<T> {
   void execute(T var1, gm<T> var2, go var3);

   default gl<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
