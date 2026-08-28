import com.google.gson.JsonObject;

public class gsj implements atd<gsi> {
   public gsi b(JsonObject $$0) {
      boolean $$1 = aye.a($$0, "blur", false);
      boolean $$2 = aye.a($$0, "clamp", false);
      return new gsi($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
