import com.google.gson.JsonObject;

public class gqx implements ato<gqw> {
   public gqw b(JsonObject $$0) {
      boolean $$1 = ayp.a($$0, "blur", false);
      boolean $$2 = ayp.a($$0, "clamp", false);
      return new gqw($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
