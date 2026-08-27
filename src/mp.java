import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public interface mp {
   void a(JsonObject var1);

   default JsonObject a() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("type", jy.u.b(this.c()).toString());
      this.a($$0);
      return $$0;
   }

   agg b();

   coj<?> c();

   @Nullable
   af d();
}
