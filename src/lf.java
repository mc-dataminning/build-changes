import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class lf<T> {
   final String a;
   final Function<T, JsonElement> b;

   public lf(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public lf<T>.a a(T $$0) {
      return new lf.a($$0);
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

      public lf<T> a() {
         return lf.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(lf.this.a, lf.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return lf.this.a + "=" + this.b;
      }
   }
}
