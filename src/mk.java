import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class mk<T> {
   final String a;
   final Function<T, JsonElement> b;

   public mk(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public mk<T>.a a(T $$0) {
      return new mk.a($$0);
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

      public mk<T> a() {
         return mk.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(mk.this.a, mk.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return mk.this.a + "=" + this.b;
      }
   }
}
