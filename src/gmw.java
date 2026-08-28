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

public record gmw(alp a, List<gmw.b> b) {
   public gmw(alp a, List<gmw.b> b) {
      b = List.copyOf(b);
      this.a = a;
      this.b = b;
   }

   protected static class a implements JsonDeserializer<gmw> {
      public gmw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         alp $$4 = alp.a(azk.i($$3, "model"));
         List<gmw.b> $$5 = this.a($$3);
         return new gmw($$4, $$5);
      }

      protected List<gmw.b> a(JsonObject $$0) {
         Map<alp, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = azk.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(alp.a($$3.getKey()), azk.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new gmw.b((alp)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static record b(alp a, float b) {
   }
}
