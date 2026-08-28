import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class on<T> {
   final String a;
   final Function<T, JsonElement> b;

   public on(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public on<T>.a a(T $$0) {
      return new on.a($$0);
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

      public on<T> a() {
         return on.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(on.this.a, on.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return on.this.a + "=" + this.b;
      }
   }
}
