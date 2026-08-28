import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class nz<T> {
   final String a;
   final Function<T, JsonElement> b;

   public nz(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public nz<T>.a a(T $$0) {
      return new nz.a($$0);
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

      public nz<T> a() {
         return nz.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(nz.this.a, nz.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return nz.this.a + "=" + this.b;
      }
   }
}
