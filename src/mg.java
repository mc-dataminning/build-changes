import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class mg<T> {
   final String a;
   final Function<T, JsonElement> b;

   public mg(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public mg<T>.a a(T $$0) {
      return new mg.a($$0);
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

      public mg<T> a() {
         return mg.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(mg.this.a, mg.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return mg.this.a + "=" + this.b;
      }
   }
}
