import com.google.gson.JsonObject;

public class gbe implements amv<gbd> {
   public gbd b(JsonObject $$0) {
      boolean $$1 = arp.a($$0, "blur", false);
      boolean $$2 = arp.a($$0, "clamp", false);
      return new gbd($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
