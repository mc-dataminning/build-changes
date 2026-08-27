import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class mc<T> {
   final String a;
   final Function<T, JsonElement> b;

   public mc(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public mc<T>.a a(T $$0) {
      return new mc.a($$0);
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

      public mc<T> a() {
         return mc.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(mc.this.a, mc.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return mc.this.a + "=" + this.b;
      }
   }
}
