import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class ne<T> {
   final String a;
   final Function<T, JsonElement> b;

   public ne(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ne<T>.a a(T $$0) {
      return new ne.a($$0);
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

      public ne<T> a() {
         return ne.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(ne.this.a, ne.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return ne.this.a + "=" + this.b;
      }
   }
}
