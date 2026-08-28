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

public class git {
   private final gip a;
   private final gik b;

   public git(gip $$0, gik $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gik a() {
      return this.b;
   }

   public Predicate<dua> a(dub<dgv, dua> $$0) {
      return this.a.getPredicate($$0);
   }

   public static class a implements JsonDeserializer<git> {
      public git a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new git(this.b($$3), (gik)$$2.deserialize($$3.get("apply"), gik.class));
      }

      private gip b(JsonObject $$0) {
         return $$0.has("when") ? a(ays.u($$0, "when")) : gip.b;
      }

      @VisibleForTesting
      static gip a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<gip> $$2 = Streams.stream(ays.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gis($$2);
            } else if ($$0.has("AND")) {
               List<gip> $$3 = Streams.stream(ays.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new gio($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new gio($$1.stream().map(git.a::a).collect(Collectors.toList()));
         }
      }

      private static gip a(Entry<String, JsonElement> $$0) {
         return new giq($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
