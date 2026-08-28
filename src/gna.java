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

public record gna(alz a, List<gna.b> b) {
   public gna(alz a, List<gna.b> b) {
      b = List.copyOf(b);
      this.a = a;
      this.b = b;
   }

   protected static class a implements JsonDeserializer<gna> {
      public gna a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         alz $$4 = alz.a(azu.i($$3, "model"));
         List<gna.b> $$5 = this.a($$3);
         return new gna($$4, $$5);
      }

      protected List<gna.b> a(JsonObject $$0) {
         Map<alz, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = azu.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(alz.a($$3.getKey()), azu.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new gna.b((alz)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static record b(alz a, float b) {
   }
}
