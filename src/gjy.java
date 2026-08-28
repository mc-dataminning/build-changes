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

public class gjy {
   private final gju a;
   private final gjp b;

   public gjy(gju $$0, gjp $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gjp a() {
      return this.b;
   }

   public Predicate<dvd> a(dve<dhy, dvd> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<gjy> {
      public gjy a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new gjy(this.b($$3), (gjp)$$2.deserialize($$3.get("apply"), gjp.class));
      }

      private gju b(JsonObject $$0) {
         return $$0.has("when") ? a(ayz.u($$0, "when")) : gju.b;
      }

      @VisibleForTesting
      static gju a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gju> $$2 = Streams.stream(ayz.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gjx($$2);
            } else if ($$0.has("AND")) {
               List<gju> $$3 = Streams.stream(ayz.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gjt($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gjt($$1.stream().map(gjy.a::a).collect(Collectors.toList()));
         }
      }

      private static gju a(Entry<String, JsonElement> $$0) {
         return new gjv($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
