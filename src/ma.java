import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class ma<T> {
   final String a;
   final Function<T, JsonElement> b;

   public ma(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ma<T>.a a(T $$0) {
      return new ma.a($$0);
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

      public ma<T> a() {
         return ma.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(ma.this.a, ma.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return ma.this.a + "=" + this.b;
      }
   }
}
