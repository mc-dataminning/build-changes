import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class nc<T> {
   final String a;
   final Function<T, JsonElement> b;

   public nc(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public nc<T>.a a(T $$0) {
      return new nc.a($$0);
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

      public nc<T> a() {
         return nc.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(nc.this.a, nc.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return nc.this.a + "=" + this.b;
      }
   }
}
