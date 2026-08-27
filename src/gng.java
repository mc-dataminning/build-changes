import com.google.gson.JsonObject;

public class gng implements asb<gnf> {
   public gnf b(JsonObject $$0) {
      boolean $$1 = axa.a($$0, "blur", false);
      boolean $$2 = axa.a($$0, "clamp", false);
      return new gnf($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
