import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class mi implements Supplier<JsonElement> {
   private final agm a;

   public mi(agm $$0) {
      this.a = $$0;
   }

   public JsonElement a() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("parent", this.a.toString());
      return $$0;
   }
}
