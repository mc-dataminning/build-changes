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

public class grf {
   private final grb a;
   private final gqv b;

   public grf(grb $$0, gqv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gqv a() {
      return this.b;
   }

   public Predicate<dzo> a(dzp<dlu, dzo> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<grf> {
      public grf a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new grf(this.b($$3), (gqv)$$2.deserialize($$3.get("apply"), gqv.class));
      }

      private grb b(JsonObject $$0) {
         return $$0.has("when") ? a(aza.u($$0, "when")) : grb.b;
      }

      @VisibleForTesting
      static grb a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<grb> $$2 = Streams.stream(aza.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gre($$2);
            } else if ($$0.has("AND")) {
               List<grb> $$3 = Streams.stream(aza.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gra($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gra($$1.stream().map(grf.a::a).collect(Collectors.toList()));
         }
      }

      private static grb a(Entry<String, JsonElement> $$0) {
         return new grc($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
