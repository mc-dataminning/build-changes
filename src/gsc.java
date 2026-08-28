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

public class gsc {
   private final gry a;
   private final grs b;

   public gsc(gry $$0, grs $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public grs a() {
      return this.b;
   }

   public Predicate<eah> a(eai<dmf, eah> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<gsc> {
      public gsc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new gsc(this.b($$3), (grs)$$2.deserialize($$3.get("apply"), grs.class));
      }

      private gry b(JsonObject $$0) {
         return $$0.has("when") ? a(azc.u($$0, "when")) : gry.b;
      }

      @VisibleForTesting
      static gry a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gry> $$2 = Streams.stream(azc.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gsb($$2);
            } else if ($$0.has("AND")) {
               List<gry> $$3 = Streams.stream(azc.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new grx($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new grx($$1.stream().map(gsc.a::a).collect(Collectors.toList()));
         }
      }

      private static gry a(Entry<String, JsonElement> $$0) {
         return new grz($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
