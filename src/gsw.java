import com.google.gson.JsonObject;

public class gsw implements atc<gsv> {
   public gsv b(JsonObject $$0) {
      boolean $$1 = ayc.a($$0, "blur", false);
      boolean $$2 = ayc.a($$0, "clamp", false);
      return new gsv($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
