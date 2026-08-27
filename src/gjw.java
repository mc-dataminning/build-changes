import com.google.gson.JsonObject;

public class gjw implements arf<gjv> {
   public gjv b(JsonObject $$0) {
      boolean $$1 = awc.a($$0, "blur", false);
      boolean $$2 = awc.a($$0, "clamp", false);
      return new gjv($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
