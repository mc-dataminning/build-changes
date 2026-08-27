import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class mi<T> {
   final String a;
   final Function<T, JsonElement> b;

   public mi(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public mi<T>.a a(T $$0) {
      return new mi.a($$0);
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

      public mi<T> a() {
         return mi.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(mi.this.a, mi.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return mi.this.a + "=" + this.b;
      }
   }
}
