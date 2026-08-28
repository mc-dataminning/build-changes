import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class od<T> {
   final String a;
   final Function<T, JsonElement> b;

   public od(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public od<T>.a a(T $$0) {
      return new od.a($$0);
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

      public od<T> a() {
         return od.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(od.this.a, od.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return od.this.a + "=" + this.b;
      }
   }
}
