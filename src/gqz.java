import com.google.gson.JsonObject;

public class gqz implements ato<gqy> {
   public gqy b(JsonObject $$0) {
      boolean $$1 = ayp.a($$0, "blur", false);
      boolean $$2 = ayp.a($$0, "clamp", false);
      return new gqy($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
