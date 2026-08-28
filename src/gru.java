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

public class gru {
   private final grq a;
   private final grk b;

   public gru(grq $$0, grk $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public grk a() {
      return this.b;
   }

   public Predicate<dzz> a(eaa<dma, dzz> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<gru> {
      public gru a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new gru(this.b($$3), (grk)$$2.deserialize($$3.get("apply"), grk.class));
      }

      private grq b(JsonObject $$0) {
         return $$0.has("when") ? a(azc.u($$0, "when")) : grq.b;
      }

      @VisibleForTesting
      static grq a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<grq> $$2 = Streams.stream(azc.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new grt($$2);
            } else if ($$0.has("AND")) {
               List<grq> $$3 = Streams.stream(azc.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new grp($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new grp($$1.stream().map(gru.a::a).collect(Collectors.toList()));
         }
      }

      private static grq a(Entry<String, JsonElement> $$0) {
         return new grr($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
