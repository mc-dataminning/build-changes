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

public class gnz {
   private final gnv a;
   private final gnp b;

   public gnz(gnv $$0, gnp $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gnp a() {
      return this.b;
   }

   public Predicate<dwx> a(dwy<djm, dwx> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<gnz> {
      public gnz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new gnz(this.b($$3), (gnp)$$2.deserialize($$3.get("apply"), gnp.class));
      }

      private gnv b(JsonObject $$0) {
         return $$0.has("when") ? a(ayp.u($$0, "when")) : gnv.b;
      }

      @VisibleForTesting
      static gnv a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gnv> $$2 = Streams.stream(ayp.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gny($$2);
            } else if ($$0.has("AND")) {
               List<gnv> $$3 = Streams.stream(ayp.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gnu($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gnu($$1.stream().map(gnz.a::a).collect(Collectors.toList()));
         }
      }

      private static gnv a(Entry<String, JsonElement> $$0) {
         return new gnw($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
