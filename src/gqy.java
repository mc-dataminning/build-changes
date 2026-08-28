import com.google.gson.JsonObject;

public class gqy implements ato<gqx> {
   public gqx b(JsonObject $$0) {
      boolean $$1 = ayp.a($$0, "blur", false);
      boolean $$2 = ayp.a($$0, "clamp", false);
      return new gqx($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
