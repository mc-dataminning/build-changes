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

public class gnn {
   private final gnj a;
   private final gne b;

   public gnn(gnj $$0, gne $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gne a() {
      return this.b;
   }

   public Predicate<dxv> a(dxw<dkm, dxv> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<gnn> {
      public gnn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new gnn(this.b($$3), (gne)$$2.deserialize($$3.get("apply"), gne.class));
      }

      private gnj b(JsonObject $$0) {
         return $$0.has("when") ? a(azu.u($$0, "when")) : gnj.b;
      }

      @VisibleForTesting
      static gnj a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gnj> $$2 = Streams.stream(azu.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gnm($$2);
            } else if ($$0.has("AND")) {
               List<gnj> $$3 = Streams.stream(azu.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gni($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gni($$1.stream().map(gnn.a::a).collect(Collectors.toList()));
         }
      }

      private static gnj a(Entry<String, JsonElement> $$0) {
         return new gnk($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
