import com.google.gson.JsonObject;

public class gqw implements atn<gqv> {
   public gqv b(JsonObject $$0) {
      boolean $$1 = ayo.a($$0, "blur", false);
      boolean $$2 = ayo.a($$0, "clamp", false);
      return new gqv($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
