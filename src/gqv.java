import com.google.gson.JsonObject;

public class gqv implements atn<gqu> {
   public gqu b(JsonObject $$0) {
      boolean $$1 = ayn.a($$0, "blur", false);
      boolean $$2 = ayn.a($$0, "clamp", false);
      return new gqu($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
