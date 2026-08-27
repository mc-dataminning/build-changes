import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public interface lp {
   void a(JsonObject var1);

   default JsonObject a() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("type", jc.u.b(this.c()).toString());
      this.a($$0);
      return $$0;
   }

   aep b();

   cmb<?> c();

   @Nullable
   JsonObject d();

   @Nullable
   aep e();
}
