import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Streams;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class gnm {
   private final gni a;
   private final gnd b;

   public gnm(gni $$0, gnd $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gnd a() {
      return this.b;
   }

   public Predicate<dxu> a(dxv<dkl, dxu> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<gnm> {
      public gnm a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new gnm(this.b($$3), (gnd)$$2.deserialize($$3.get("apply"), gnd.class));
      }

      private gni b(JsonObject $$0) {
         return $$0.has("when") ? a(azu.u($$0, "when")) : gni.b;
      }

      @VisibleForTesting
      static gni a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gni> $$2 = Streams.stream(azu.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gnl($$2);
            } else if ($$0.has("AND")) {
               List<gni> $$3 = Streams.stream(azu.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gnh($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gnh($$1.stream().map(gnm.a::a).collect(Collectors.toList()));
         }
      }

      private static gni a(Entry<String, JsonElement> $$0) {
         return new gnj($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
