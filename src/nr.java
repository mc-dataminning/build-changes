import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class nr<T> {
   final String a;
   final Function<T, JsonElement> b;

   public nr(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public nr<T>.a a(T $$0) {
      return new nr.a($$0);
   }

   @Override
   public String toString() {
      return this.a;
   }

   public class a {
      private final T b;

      public a(T $$1) {
         this.b = $$1;
      }

      public nr<T> a() {
         return nr.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(nr.this.a, nr.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return nr.this.a + "=" + this.b;
      }
   }
}
