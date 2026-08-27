import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class nt<T> {
   final String a;
   final Function<T, JsonElement> b;

   public nt(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public nt<T>.a a(T $$0) {
      return new nt.a($$0);
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

      public nt<T> a() {
         return nt.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(nt.this.a, nt.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return nt.this.a + "=" + this.b;
      }
   }
}
