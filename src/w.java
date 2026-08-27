import java.util.Objects;

public class w<T> {
   private static final w<?> a = new w(null);
   private final T b;

   private w(T $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this == a;
   }

   public boolean b() {
      return !this.a();
   }

   public T c() {
      if (this.a()) {
         throw new UnsupportedOperationException("No value");
      } else {
         return this.b;
      }
   }

   public static <T> w<T> d() {
      return (w<T>)a;
   }

   public static <T> w<T> a(T $$0) {
      return new w<>($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         w<?> $$1 = (w<?>)$$0;
         return this.a() != $$1.a() ? false : Objects.equals(this.b, $$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a() ? 0 : Objects.hashCode(this.b);
   }
}
