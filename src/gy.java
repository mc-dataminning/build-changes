public class gy<T extends dw<T>> implements gn<T> {
   private static final gy<? extends dw<?>> a = (gy<? extends dw<?>>)(new gy<>());

   public static <T extends dw<T>> gn<T> a() {
      return (gn<T>)a;
   }

   @Override
   public void execute(go<T> $$0, gq $$1) {
      $$1.a();
      $$1.b();
   }
}
