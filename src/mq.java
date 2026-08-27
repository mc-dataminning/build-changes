import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class mq<T> {
   final String a;
   final Function<T, JsonElement> b;

   public mq(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public mq<T>.a a(T $$0) {
      return new mq.a($$0);
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

      public mq<T> a() {
         return mq.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(mq.this.a, mq.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return mq.this.a + "=" + this.b;
      }
   }
}
