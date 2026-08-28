import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class oi<T> {
   final String a;
   final Function<T, JsonElement> b;

   public oi(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public oi<T>.a a(T $$0) {
      return new oi.a($$0);
   }

   @Override
   public String toString() {
      return this.a;
   }

   public class a {
      private final T b;

      public a(final T $$1) {
         this.b = $$1;
      }

      public oi<T> a() {
         return oi.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(oi.this.a, oi.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return oi.this.a + "=" + this.b;
      }
   }
}
