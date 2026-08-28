import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class oh implements Supplier<JsonElement> {
   private final Map<oj<?>, oj<?>.a> a = Maps.newLinkedHashMap();

   public <T> oh a(oj<T> $$0, T $$1) {
      oj<?>.a $$2 = this.a.put($$0, $$0.a($$1));
      if ($$2 != null) {
         throw new IllegalStateException("Replacing value of " + $$2 + " with " + $$1);
      } else {
         return this;
      }
   }

   public static oh a() {
      return new oh();
   }

   public static oh a(oh $$0, oh $$1) {
      oh $$2 = new oh();
      $$2.a.putAll($$0.a);
      $$2.a.putAll($$1.a);
      return $$2;
   }

   public JsonElement b() {
      JsonObject $$0 = new JsonObject();
      this.a.values().forEach($$1 -> $$1.a($$0));
      return $$0;
   }

   public static JsonElement a(List<oh> $$0) {
      if ($$0.size() == 1) {
         return $$0.get(0).b();
      } else {
         JsonArray $$1 = new JsonArray();
         $$0.forEach($$1x -> $$1.add($$1x.b()));
         return $$1;
      }
   }
}
