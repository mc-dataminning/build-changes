@FunctionalInterface
public interface hf<T> {
   void execute(T var1, hb<T> var2, hd var3);

   default ha<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
