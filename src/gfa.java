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

public class gfa {
   private final Map<String, gfh> a = Maps.newLinkedHashMap();
   private gfm b;

   public static gfa a(gfa.a $$0, Reader $$1) {
      return axu.a($$0.a, $$1, gfa.class);
   }

   public static gfa a(gfa.a $$0, JsonElement $$1) {
      return (gfa)$$0.a.fromJson($$1, gfa.class);
   }

   public gfa(Map<String, gfh> $$0, gfm $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public gfa(List<gfa> $$0) {
      gfa $$1 = null;

      for (gfa $$2 : $$0) {
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
   public gfh b(String $$0) {
      gfh $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new gfa.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof gfa $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, gfh> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<gfh> b() {
      Set<gfh> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public gfm d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(gfa.class, new gfa.b())
         .registerTypeAdapter(gfi.class, new gfi.a())
         .registerTypeAdapter(gfh.class, new gfh.a())
         .registerTypeAdapter(gfm.class, new gfm.a(this))
         .registerTypeAdapter(gfo.class, new gfo.a())
         .create();
      private dsi<dff, dsh> b;

      public dsi<dff, dsh> a() {
         return this.b;
      }

      public void a(dsi<dff, dsh> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<gfa> {
      public gfa a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, gfh> $$4 = this.a($$2, $$3);
         gfm $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new gfa($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, gfh> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, gfh> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = axu.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (gfh)$$0.deserialize($$4.getValue(), gfh.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected gfm b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = axu.v($$1, "multipart");
            return (gfm)$$0.deserialize($$2, gfm.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
