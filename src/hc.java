public class hc<T extends dw<T>> implements gr<T> {
   private static final hc<? extends dw<?>> a = (hc<? extends dw<?>>)(new hc<>());

   public static <T extends dw<T>> gr<T> a() {
      return (gr<T>)a;
   }

   @Override
   public void execute(gs<T> $$0, gu $$1) {
      $$1.a();
      $$1.b();
   }
}
