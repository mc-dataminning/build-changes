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

public class gkz {
   private final gkv a;
   private final gkq b;

   public gkz(gkv $$0, gkq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gkq a() {
      return this.b;
   }

   public Predicate<dvo> a(dvp<dij, dvo> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<gkz> {
      public gkz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new gkz(this.b($$3), (gkq)$$2.deserialize($$3.get("apply"), gkq.class));
      }

      private gkv b(JsonObject $$0) {
         return $$0.has("when") ? a(azd.u($$0, "when")) : gkv.b;
      }

      @VisibleForTesting
      static gkv a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gkv> $$2 = Streams.stream(azd.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gky($$2);
            } else if ($$0.has("AND")) {
               List<gkv> $$3 = Streams.stream(azd.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gku($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gku($$1.stream().map(gkz.a::a).collect(Collectors.toList()));
         }
      }

      private static gkv a(Entry<String, JsonElement> $$0) {
         return new gkw($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
