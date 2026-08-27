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

public class gdn {
   private final Map<String, gdu> a = Maps.newLinkedHashMap();
   private gdz b;

   public static gdn a(gdn.a $$0, Reader $$1) {
      return axv.a($$0.a, $$1, gdn.class);
   }

   public static gdn a(gdn.a $$0, JsonElement $$1) {
      return (gdn)$$0.a.fromJson($$1, gdn.class);
   }

   public gdn(Map<String, gdu> $$0, gdz $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public gdn(List<gdn> $$0) {
      gdn $$1 = null;

      for (gdn $$2 : $$0) {
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
   public gdu b(String $$0) {
      gdu $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new gdn.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof gdn $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, gdu> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<gdu> b() {
      Set<gdu> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public gdz d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(gdn.class, new gdn.b())
         .registerTypeAdapter(gdv.class, new gdv.a())
         .registerTypeAdapter(gdu.class, new gdu.a())
         .registerTypeAdapter(gdz.class, new gdz.a(this))
         .registerTypeAdapter(geb.class, new geb.a())
         .create();
      private dre<dea, drd> b;

      public dre<dea, drd> a() {
         return this.b;
      }

      public void a(dre<dea, drd> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<gdn> {
      public gdn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, gdu> $$4 = this.a($$2, $$3);
         gdz $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new gdn($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, gdu> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, gdu> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = axv.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (gdu)$$0.deserialize($$4.getValue(), gdu.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected gdz b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = axv.v($$1, "multipart");
            return (gdz)$$0.deserialize($$2, gdz.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
