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

public record gkn(all a, List<gkn.b> b) {
   public gkn(all a, List<gkn.b> b) {
      b = List.copyOf(b);
      this.a = a;
      this.b = b;
   }

   protected static class a implements JsonDeserializer<gkn> {
      public gkn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         all $$4 = all.a(azd.i($$3, "model"));
         List<gkn.b> $$5 = this.a($$3);
         return new gkn($$4, $$5);
      }

      protected List<gkn.b> a(JsonObject $$0) {
         Map<all, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = azd.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(all.a($$3.getKey()), azd.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new gkn.b((all)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static record b(all a, float b) {
   }
}
