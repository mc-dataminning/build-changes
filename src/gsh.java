import com.google.gson.JsonObject;

public class gsh implements atd<gsg> {
   public gsg b(JsonObject $$0) {
      boolean $$1 = aye.a($$0, "blur", false);
      boolean $$2 = aye.a($$0, "clamp", false);
      return new gsg($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
