@FunctionalInterface
public interface ic<T> {
   void execute(T var1, hy<T> var2, ia var3);

   default hx<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
