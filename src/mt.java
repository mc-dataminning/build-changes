import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public interface mt {
   void a(JsonObject var1);

   default JsonObject a() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("type", kc.u.b(this.c()).toString());
      this.a($$0);
      return $$0;
   }

   agm b();

   cox<?> c();

   @Nullable
   af d();
}
