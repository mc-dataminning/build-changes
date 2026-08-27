import com.google.gson.JsonObject;

public class giy implements arb<gix> {
   public gix b(JsonObject $$0) {
      boolean $$1 = avy.a($$0, "blur", false);
      boolean $$2 = avy.a($$0, "clamp", false);
      return new gix($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
