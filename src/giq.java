import com.google.gson.JsonObject;

public class giq implements ara<gip> {
   public gip b(JsonObject $$0) {
      boolean $$1 = avx.a($$0, "blur", false);
      boolean $$2 = avx.a($$0, "clamp", false);
      return new gip($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
