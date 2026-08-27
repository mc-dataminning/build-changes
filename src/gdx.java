import com.google.gson.JsonObject;

public class gdx implements aol<gdw> {
   public gdw b(JsonObject $$0) {
      boolean $$1 = atg.a($$0, "blur", false);
      boolean $$2 = atg.a($$0, "clamp", false);
      return new gdw($$1, $$2);
   }

   @Override
   public String a() {
      return "texture";
   }
}
