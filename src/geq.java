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

public class geq {
   private final Map<String, gex> a = Maps.newLinkedHashMap();
   private gfc b;

   public static geq a(geq.a $$0, Reader $$1) {
      return ayo.a($$0.a, $$1, geq.class);
   }

   public static geq a(geq.a $$0, JsonElement $$1) {
      return (geq)$$0.a.fromJson($$1, geq.class);
   }

   public geq(Map<String, gex> $$0, gfc $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public geq(List<geq> $$0) {
      geq $$1 = null;

      for (geq $$2 : $$0) {
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
   public gex b(String $$0) {
      gex $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new geq.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof geq $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, gex> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<gex> b() {
      Set<gex> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public gfc d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(geq.class, new geq.b())
         .registerTypeAdapter(gey.class, new gey.a())
         .registerTypeAdapter(gex.class, new gex.a())
         .registerTypeAdapter(gfc.class, new gfc.a(this))
         .registerTypeAdapter(gfe.class, new gfe.a())
         .create();
      private dsc<dey, dsb> b;

      public dsc<dey, dsb> a() {
         return this.b;
      }

      public void a(dsc<dey, dsb> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<geq> {
      public geq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, gex> $$4 = this.a($$2, $$3);
         gfc $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new geq($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, gex> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, gex> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = ayo.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (gex)$$0.deserialize($$4.getValue(), gex.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected gfc b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = ayo.v($$1, "multipart");
            return (gfc)$$0.deserialize($$2, gfc.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
