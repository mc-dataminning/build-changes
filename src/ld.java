import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class ld<T> {
   final String a;
   final Function<T, JsonElement> b;

   public ld(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ld<T>.a a(T $$0) {
      return new ld.a($$0);
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

      public ld<T> a() {
         return ld.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(ld.this.a, ld.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return ld.this.a + "=" + this.b;
      }
   }
}
