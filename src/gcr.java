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

public class gcr {
   private final Map<String, gcy> a = Maps.newLinkedHashMap();
   private gdd b;

   public static gcr a(gcr.a $$0, Reader $$1) {
      return axp.a($$0.a, $$1, gcr.class);
   }

   public static gcr a(gcr.a $$0, JsonElement $$1) {
      return (gcr)$$0.a.fromJson($$1, gcr.class);
   }

   public gcr(Map<String, gcy> $$0, gdd $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public gcr(List<gcr> $$0) {
      gcr $$1 = null;

      for (gcr $$2 : $$0) {
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
   public gcy b(String $$0) {
      gcy $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new gcr.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof gcr $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, gcy> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<gcy> b() {
      Set<gcy> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public gdd d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(gcr.class, new gcr.b())
         .registerTypeAdapter(gcz.class, new gcz.a())
         .registerTypeAdapter(gcy.class, new gcy.a())
         .registerTypeAdapter(gdd.class, new gdd.a(this))
         .registerTypeAdapter(gdf.class, new gdf.a())
         .create();
      private dqi<dde, dqh> b;

      public dqi<dde, dqh> a() {
         return this.b;
      }

      public void a(dqi<dde, dqh> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<gcr> {
      public gcr a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, gcy> $$4 = this.a($$2, $$3);
         gdd $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new gcr($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, gcy> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, gcy> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = axp.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (gcy)$$0.deserialize($$4.getValue(), gcy.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected gdd b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = axp.v($$1, "multipart");
            return (gdd)$$0.deserialize($$2, gdd.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
