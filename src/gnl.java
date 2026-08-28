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

public class gnl {
   private final gnh a;
   private final gnc b;

   public gnl(gnh $$0, gnc $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gnc a() {
      return this.b;
   }

   public Predicate<dxu> a(dxv<dkl, dxu> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<gnl> {
      public gnl a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new gnl(this.b($$3), (gnc)$$2.deserialize($$3.get("apply"), gnc.class));
      }

      private gnh b(JsonObject $$0) {
         return $$0.has("when") ? a(azu.u($$0, "when")) : gnh.b;
      }

      @VisibleForTesting
      static gnh a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gnh> $$2 = Streams.stream(azu.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gnk($$2);
            } else if ($$0.has("AND")) {
               List<gnh> $$3 = Streams.stream(azu.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gng($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gng($$1.stream().map(gnl.a::a).collect(Collectors.toList()));
         }
      }

      private static gnh a(Entry<String, JsonElement> $$0) {
         return new gni($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
