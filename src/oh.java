import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class oh<T> {
   final String a;
   final Function<T, JsonElement> b;

   public oh(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public oh<T>.a a(T $$0) {
      return new oh.a($$0);
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

      public oh<T> a() {
         return oh.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(oh.this.a, oh.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return oh.this.a + "=" + this.b;
      }
   }
}
