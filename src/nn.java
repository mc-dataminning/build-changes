import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class nn<T> {
   final String a;
   final Function<T, JsonElement> b;

   public nn(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public nn<T>.a a(T $$0) {
      return new nn.a($$0);
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

      public nn<T> a() {
         return nn.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(nn.this.a, nn.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return nn.this.a + "=" + this.b;
      }
   }
}
