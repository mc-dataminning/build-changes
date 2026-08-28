import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class oj<T> {
   final String a;
   final Function<T, JsonElement> b;

   public oj(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public oj<T>.a a(T $$0) {
      return new oj.a($$0);
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

      public oj<T> a() {
         return oj.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(oj.this.a, oj.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return oj.this.a + "=" + this.b;
      }
   }
}
