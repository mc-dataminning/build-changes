@FunctionalInterface
public interface gs<T> {
   void execute(T var1, go<T> var2, gq var3);

   default gn<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
