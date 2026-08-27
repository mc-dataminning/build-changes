import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class no<T> {
   final String a;
   final Function<T, JsonElement> b;

   public no(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public no<T>.a a(T $$0) {
      return new no.a($$0);
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

      public no<T> a() {
         return no.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(no.this.a, no.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return no.this.a + "=" + this.b;
      }
   }
}
