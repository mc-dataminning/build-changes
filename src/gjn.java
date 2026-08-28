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

public class gjn {
   private final gjj a;
   private final gje b;

   public gjn(gjj $$0, gje $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gje a() {
      return this.b;
   }

   public Predicate<dus> a(dut<dhm, dus> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<gjn> {
      public gjn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new gjn(this.b($$3), (gje)$$2.deserialize($$3.get("apply"), gje.class));
      }

      private gjj b(JsonObject $$0) {
         return $$0.has("when") ? a(ayv.u($$0, "when")) : gjj.b;
      }

      @VisibleForTesting
      static gjj a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gjj> $$2 = Streams.stream(ayv.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gjm($$2);
            } else if ($$0.has("AND")) {
               List<gjj> $$3 = Streams.stream(ayv.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gji($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gji($$1.stream().map(gjn.a::a).collect(Collectors.toList()));
         }
      }

      private static gjj a(Entry<String, JsonElement> $$0) {
         return new gjk($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
