import javax.annotation.Nullable;

public interface il<T> extends Iterable<T> {
   int a = -1;

   int a(T var1);

   @Nullable
   T a(int var1);

   default T b(int $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No value with id " + $$0);
      } else {
         return $$1;
      }
   }

   int b();
}
