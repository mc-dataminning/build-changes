import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public interface ls {
   void a(JsonObject var1);

   default JsonObject a() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("type", jd.u.b(this.c()).toString());
      this.a($$0);
      return $$0;
   }

   aey b();

   cmo<?> c();

   @Nullable
   af d();
}
