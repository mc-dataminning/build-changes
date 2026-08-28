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

public class goa {
   private final gnw a;
   private final gnq b;

   public goa(gnw $$0, gnq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gnq a() {
      return this.b;
   }

   public Predicate<dwx> a(dwy<djm, dwx> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<goa> {
      public goa a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new goa(this.b($$3), (gnq)$$2.deserialize($$3.get("apply"), gnq.class));
      }

      private gnw b(JsonObject $$0) {
         return $$0.has("when") ? a(ayp.u($$0, "when")) : gnw.b;
      }

      @VisibleForTesting
      static gnw a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gnw> $$2 = Streams.stream(ayp.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gnz($$2);
            } else if ($$0.has("AND")) {
               List<gnw> $$3 = Streams.stream(ayp.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gnv($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gnv($$1.stream().map(goa.a::a).collect(Collectors.toList()));
         }
      }

      private static gnw a(Entry<String, JsonElement> $$0) {
         return new gnx($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
