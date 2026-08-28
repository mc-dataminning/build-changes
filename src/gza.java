import com.google.gson.JsonObject;

public class gza implements ats<gyz> {
   public gyz b(JsonObject $$0) {
      boolean $$1 = ayt.a($$0, "blur", false);
      boolean $$2 = ayt.a($$0, "clamp", false);
      return new gyz($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
