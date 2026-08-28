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

public class gqa {
   private final gpw a;
   private final gpq b;

   public gqa(gpw $$0, gpq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gpq a() {
      return this.b;
   }

   public Predicate<dym> a(dyn<dku, dym> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<gqa> {
      public gqa a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new gqa(this.b($$3), (gpq)$$2.deserialize($$3.get("apply"), gpq.class));
      }

      private gpw b(JsonObject $$0) {
         return $$0.has("when") ? a(aza.u($$0, "when")) : gpw.b;
      }

      @VisibleForTesting
      static gpw a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gpw> $$2 = Streams.stream(aza.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gpz($$2);
            } else if ($$0.has("AND")) {
               List<gpw> $$3 = Streams.stream(aza.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gpv($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gpv($$1.stream().map(gqa.a::a).collect(Collectors.toList()));
         }
      }

      private static gpw a(Entry<String, JsonElement> $$0) {
         return new gpx($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
