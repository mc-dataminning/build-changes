import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class ny<T> {
   final String a;
   final Function<T, JsonElement> b;

   public ny(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ny<T>.a a(T $$0) {
      return new ny.a($$0);
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

      public ny<T> a() {
         return ny.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(ny.this.a, ny.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return ny.this.a + "=" + this.b;
      }
   }
}
