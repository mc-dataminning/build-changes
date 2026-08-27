@FunctionalInterface
public interface gu<T> {
   void execute(T var1, gq<T> var2, gs var3);

   default gp<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
