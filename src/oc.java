import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class oc<T> {
   final String a;
   final Function<T, JsonElement> b;

   public oc(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public oc<T>.a a(T $$0) {
      return new oc.a($$0);
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

      public oc<T> a() {
         return oc.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(oc.this.a, oc.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return oc.this.a + "=" + this.b;
      }
   }
}
