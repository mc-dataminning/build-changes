import com.google.gson.JsonObject;

public class ggk implements api<ggj> {
   public ggj b(JsonObject $$0) {
      boolean $$1 = aue.a($$0, "blur", false);
      boolean $$2 = aue.a($$0, "clamp", false);
      return new ggj($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
