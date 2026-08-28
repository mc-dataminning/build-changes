@FunctionalInterface
public interface hp<T> {
   void execute(T var1, hl<T> var2, hn var3);

   default hk<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
