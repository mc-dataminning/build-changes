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

public class gji {
   private final gje a;
   private final giz b;

   public gji(gje $$0, giz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public giz a() {
      return this.b;
   }

   public Predicate<duo> a(dup<dhj, duo> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<gji> {
      public gji a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new gji(this.b($$3), (giz)$$2.deserialize($$3.get("apply"), giz.class));
      }

      private gje b(JsonObject $$0) {
         return $$0.has("when") ? a(ayt.u($$0, "when")) : gje.b;
      }

      @VisibleForTesting
      static gje a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gje> $$2 = Streams.stream(ayt.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gjh($$2);
            } else if ($$0.has("AND")) {
               List<gje> $$3 = Streams.stream(ayt.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gjd($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gjd($$1.stream().map(gji.a::a).collect(Collectors.toList()));
         }
      }

      private static gje a(Entry<String, JsonElement> $$0) {
         return new gjf($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
