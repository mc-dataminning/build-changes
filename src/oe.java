import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class oe implements Supplier<JsonElement> {
   private final alf a;

   public oe(alf $$0) {
      this.a = $$0;
   }

   public JsonElement a() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("parent", this.a.toString());
      return $$0;
   }
}
