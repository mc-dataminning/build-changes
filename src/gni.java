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

public class gni {
   private final gne a;
   private final gmz b;

   public gni(gne $$0, gmz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gmz a() {
      return this.b;
   }

   public Predicate<dxo> a(dxp<dkd, dxo> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<gni> {
      public gni a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new gni(this.b($$3), (gmz)$$2.deserialize($$3.get("apply"), gmz.class));
      }

      private gne b(JsonObject $$0) {
         return $$0.has("when") ? a(azk.u($$0, "when")) : gne.b;
      }

      @VisibleForTesting
      static gne a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gne> $$2 = Streams.stream(azk.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gnh($$2);
            } else if ($$0.has("AND")) {
               List<gne> $$3 = Streams.stream(azk.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gnd($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gnd($$1.stream().map(gni.a::a).collect(Collectors.toList()));
         }
      }

      private static gne a(Entry<String, JsonElement> $$0) {
         return new gnf($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
