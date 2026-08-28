import com.google.gson.JsonObject;

public class hbd implements aub<hbc> {
   public hbc b(JsonObject $$0) {
      boolean $$1 = azc.a($$0, "blur", false);
      boolean $$2 = azc.a($$0, "clamp", false);
      return new hbc($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
