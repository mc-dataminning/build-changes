import com.google.gson.JsonObject;

public class gaj implements amm<gai> {
   public gai b(JsonObject $$0) {
      boolean $$1 = arg.a($$0, "blur", false);
      boolean $$2 = arg.a($$0, "clamp", false);
      return new gai($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
