import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class og<T> {
   final String a;
   final Function<T, JsonElement> b;

   public og(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public og<T>.a a(T $$0) {
      return new og.a($$0);
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

      public og<T> a() {
         return og.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(og.this.a, og.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return og.this.a + "=" + this.b;
      }
   }
}
