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

public record gjm(alh a, List<gjm.b> b) {
   public gjm(alh a, List<gjm.b> b) {
      b = List.copyOf(b);
      this.a = a;
      this.b = b;
   }

   protected static class a implements JsonDeserializer<gjm> {
      public gjm a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         alh $$4 = alh.a(ayz.i($$3, "model"));
         List<gjm.b> $$5 = this.a($$3);
         return new gjm($$4, $$5);
      }

      protected List<gjm.b> a(JsonObject $$0) {
         Map<alh, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = ayz.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(alh.a($$3.getKey()), ayz.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new gjm.b((alh)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static record b(alh a, float b) {
   }
}
