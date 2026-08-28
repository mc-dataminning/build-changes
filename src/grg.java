import com.google.gson.JsonObject;

public class grg implements ast<grf> {
   public grf b(JsonObject $$0) {
      boolean $$1 = axu.a($$0, "blur", false);
      boolean $$2 = axu.a($$0, "clamp", false);
      return new grf($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
