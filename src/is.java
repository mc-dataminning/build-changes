import javax.annotation.Nullable;

public interface is<T> extends Iterable<T> {
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

   default int c(T $$0) {
      int $$1 = this.a($$0);
      if ($$1 == -1) {
         throw new IllegalArgumentException("Can't find id for '" + $$0 + "' in map " + this);
      } else {
         return $$1;
      }
   }

   int b();
}
