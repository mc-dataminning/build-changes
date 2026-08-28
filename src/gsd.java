import com.google.gson.JsonObject;

public class gsd implements atc<gsc> {
   public gsc b(JsonObject $$0) {
      boolean $$1 = ayd.a($$0, "blur", false);
      boolean $$2 = ayd.a($$0, "clamp", false);
      return new gsc($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
