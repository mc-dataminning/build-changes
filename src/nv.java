import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class nv<T> {
   final String a;
   final Function<T, JsonElement> b;

   public nv(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public nv<T>.a a(T $$0) {
      return new nv.a($$0);
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

      public nv<T> a() {
         return nv.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(nv.this.a, nv.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return nv.this.a + "=" + this.b;
      }
   }
}
