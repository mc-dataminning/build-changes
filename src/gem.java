import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gem {
   private final Map<String, get> a = Maps.newLinkedHashMap();
   private gey b;

   public static gem a(gem.a $$0, Reader $$1) {
      return ayk.a($$0.a, $$1, gem.class);
   }

   public static gem a(gem.a $$0, JsonElement $$1) {
      return (gem)$$0.a.fromJson($$1, gem.class);
   }

   public gem(Map<String, get> $$0, gey $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public gem(List<gem> $$0) {
      gem $$1 = null;

      for (gem $$2 : $$0) {
         if ($$2.c()) {
            this.a.clear();
            $$1 = $$2;
         }

         this.a.putAll($$2.a);
      }

      if ($$1 != null) {
         this.b = $$1.b;
      }
   }

   @VisibleForTesting
   public boolean a(String $$0) {
      return this.a.get($$0) != null;
   }

   @VisibleForTesting
   public get b(String $$0) {
      get $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new gem.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof gem $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, get> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<get> b() {
      Set<get> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public gey d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(gem.class, new gem.b())
         .registerTypeAdapter(geu.class, new geu.a())
         .registerTypeAdapter(get.class, new get.a())
         .registerTypeAdapter(gey.class, new gey.a(this))
         .registerTypeAdapter(gfa.class, new gfa.a())
         .create();
      private dry<deu, drx> b;

      public dry<deu, drx> a() {
         return this.b;
      }

      public void a(dry<deu, drx> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<gem> {
      public gem a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, get> $$4 = this.a($$2, $$3);
         gey $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new gem($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, get> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, get> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = ayk.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (get)$$0.deserialize($$4.getValue(), get.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected gey b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = ayk.v($$1, "multipart");
            return (gey)$$0.deserialize($$2, gey.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
