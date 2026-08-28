import com.google.gson.JsonObject;

public class gzr implements aty<gzq> {
   public gzq b(JsonObject $$0) {
      boolean $$1 = ayz.a($$0, "blur", false);
      boolean $$2 = ayz.a($$0, "clamp", false);
      return new gzq($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
