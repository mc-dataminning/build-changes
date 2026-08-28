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

public class gfi {
   private final Map<String, gfp> a = Maps.newLinkedHashMap();
   private gfu b;

   public static gfi a(gfi.a $$0, Reader $$1) {
      return axw.a($$0.a, $$1, gfi.class);
   }

   public static gfi a(gfi.a $$0, JsonElement $$1) {
      return (gfi)$$0.a.fromJson($$1, gfi.class);
   }

   public gfi(Map<String, gfp> $$0, gfu $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public gfi(List<gfi> $$0) {
      gfi $$1 = null;

      for (gfi $$2 : $$0) {
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
   public gfp b(String $$0) {
      gfp $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new gfi.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof gfi $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, gfp> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<gfp> b() {
      Set<gfp> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public gfu d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(gfi.class, new gfi.b())
         .registerTypeAdapter(gfq.class, new gfq.a())
         .registerTypeAdapter(gfp.class, new gfp.a())
         .registerTypeAdapter(gfu.class, new gfu.a(this))
         .registerTypeAdapter(gfw.class, new gfw.a())
         .create();
      private dsm<dfi, dsl> b;

      public dsm<dfi, dsl> a() {
         return this.b;
      }

      public void a(dsm<dfi, dsl> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<gfi> {
      public gfi a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, gfp> $$4 = this.a($$2, $$3);
         gfu $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new gfi($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, gfp> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, gfp> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = axw.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (gfp)$$0.deserialize($$4.getValue(), gfp.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected gfu b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = axw.v($$1, "multipart");
            return (gfu)$$0.deserialize($$2, gfu.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
