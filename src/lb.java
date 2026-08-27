import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class lb<T> {
   final String a;
   final Function<T, JsonElement> b;

   public lb(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public lb<T>.a a(T $$0) {
      return new lb.a($$0);
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

      public lb<T> a() {
         return lb.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(lb.this.a, lb.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return lb.this.a + "=" + this.b;
      }
   }
}
