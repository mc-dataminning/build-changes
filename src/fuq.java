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

public class fuq {
   private final fum a;
   private final fuj b;

   public fuq(fum $$0, fuj $$1) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Missing condition for selector");
      } else if ($$1 == null) {
         throw new IllegalArgumentException("Missing variant for selector");
      } else {
         this.a = $$0;
         this.b = $$1;
      }
   }

   public fuj a() {
      return this.b;
   }

   public Predicate<dja> a(djb<cwj, dja> $$0) {
      return this.a.getPredicate($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0;
   }

   @Override
   public int hashCode() {
      return System.identityHashCode(this);
   }

   public static class a implements JsonDeserializer<fuq> {
      public fuq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new fuq(this.b($$3), (fuj)$$2.deserialize($$3.get("apply"), fuj.class));
      }

      private fum b(JsonObject $$0) {
         return $$0.has("when") ? a(aty.u($$0, "when")) : fum.b;
      }

      @VisibleForTesting
      static fum a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<fum> $$2 = Streams.stream(aty.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new fup($$2);
            } else if ($$0.has("AND")) {
               List<fum> $$3 = Streams.stream(aty.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new ful($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new ful($$1.stream().map(fuq.a::a).collect(Collectors.toList()));
         }
      }

      private static fum a(Entry<String, JsonElement> $$0) {
         return new fun($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
