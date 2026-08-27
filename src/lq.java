import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public interface lq {
   void a(JsonObject var1);

   default JsonObject a() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("type", jb.u.b(this.c()).toString());
      this.a($$0);
      return $$0;
   }

   aew b();

   cmm<?> c();

   @Nullable
   af d();
}
