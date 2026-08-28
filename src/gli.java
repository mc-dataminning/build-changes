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

public class gli {
   private final gle a;
   private final gkz b;

   public gli(gle $$0, gkz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gkz a() {
      return this.b;
   }

   public Predicate<dvv> a(dvw<diq, dvv> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<gli> {
      public gli a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new gli(this.b($$3), (gkz)$$2.deserialize($$3.get("apply"), gkz.class));
      }

      private gle b(JsonObject $$0) {
         return $$0.has("when") ? a(azc.u($$0, "when")) : gle.b;
      }

      @VisibleForTesting
      static gle a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gle> $$2 = Streams.stream(azc.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new glh($$2);
            } else if ($$0.has("AND")) {
               List<gle> $$3 = Streams.stream(azc.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gld($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gld($$1.stream().map(gli.a::a).collect(Collectors.toList()));
         }
      }

      private static gle a(Entry<String, JsonElement> $$0) {
         return new glf($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
