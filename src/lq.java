import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public interface lq {
   void a(JsonObject var1);

   default JsonObject a() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("type", jd.u.b(this.c()).toString());
      this.a($$0);
      return $$0;
   }

   aeu b();

   cmh<?> c();

   @Nullable
   af d();
}
