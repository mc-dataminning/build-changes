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

public class gbl {
   private final Map<String, gbs> a = Maps.newLinkedHashMap();
   private gbx b;

   public static gbl a(gbl.a $$0, Reader $$1) {
      return axc.a($$0.a, $$1, gbl.class);
   }

   public static gbl a(gbl.a $$0, JsonElement $$1) {
      return (gbl)$$0.a.fromJson($$1, gbl.class);
   }

   public gbl(Map<String, gbs> $$0, gbx $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public gbl(List<gbl> $$0) {
      gbl $$1 = null;

      for (gbl $$2 : $$0) {
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
   public gbs b(String $$0) {
      gbs $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new gbl.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof gbl $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, gbs> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<gbs> b() {
      Set<gbs> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public gbx d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(gbl.class, new gbl.b())
         .registerTypeAdapter(gbt.class, new gbt.a())
         .registerTypeAdapter(gbs.class, new gbs.a())
         .registerTypeAdapter(gbx.class, new gbx.a(this))
         .registerTypeAdapter(gbz.class, new gbz.a())
         .create();
      private dpj<dch, dpi> b;

      public dpj<dch, dpi> a() {
         return this.b;
      }

      public void a(dpj<dch, dpi> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<gbl> {
      public gbl a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, gbs> $$4 = this.a($$2, $$3);
         gbx $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new gbl($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, gbs> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, gbs> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = axc.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (gbs)$$0.deserialize($$4.getValue(), gbs.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected gbx b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = axc.v($$1, "multipart");
            return (gbx)$$0.deserialize($$2, gbx.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
