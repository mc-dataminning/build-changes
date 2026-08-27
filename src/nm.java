import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class nm implements Supplier<JsonElement> {
   private final Map<no<?>, no<?>.a> a = Maps.newLinkedHashMap();

   public <T> nm a(no<T> $$0, T $$1) {
      no<?>.a $$2 = this.a.put($$0, $$0.a($$1));
      if ($$2 != null) {
         throw new IllegalStateException("Replacing value of " + $$2 + " with " + $$1);
      } else {
         return this;
      }
   }

   public static nm a() {
      return new nm();
   }

   public static nm a(nm $$0, nm $$1) {
      nm $$2 = new nm();
      $$2.a.putAll($$0.a);
      $$2.a.putAll($$1.a);
      return $$2;
   }

   public JsonElement b() {
      JsonObject $$0 = new JsonObject();
      this.a.values().forEach($$1 -> $$1.a($$0));
      return $$0;
   }

   public static JsonElement a(List<nm> $$0) {
      if ($$0.size() == 1) {
         return $$0.get(0).b();
      } else {
         JsonArray $$1 = new JsonArray();
         $$0.forEach($$1x -> $$1.add($$1x.b()));
         return $$1;
      }
   }
}
