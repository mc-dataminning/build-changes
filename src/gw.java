@FunctionalInterface
public interface gw<T> {
   void execute(T var1, gs<T> var2, gu var3);

   default gr<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
