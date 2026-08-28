import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public record gjx(ali a, List<gjx.b> b) {
   public gjx(ali a, List<gjx.b> b) {
      b = List.copyOf(b);
      this.a = a;
      this.b = b;
   }

   protected static class a implements JsonDeserializer<gjx> {
      public gjx a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ali $$4 = ali.a(aza.i($$3, "model"));
         List<gjx.b> $$5 = this.a($$3);
         return new gjx($$4, $$5);
      }

      protected List<gjx.b> a(JsonObject $$0) {
         Map<ali, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = aza.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(ali.a($$3.getKey()), aza.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new gjx.b((ali)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static record b(ali a, float b) {
   }
}
