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

public class gfg {
   private final Map<String, gfn> a = Maps.newLinkedHashMap();
   private gfs b;

   public static gfg a(gfg.a $$0, Reader $$1) {
      return axw.a($$0.a, $$1, gfg.class);
   }

   public static gfg a(gfg.a $$0, JsonElement $$1) {
      return (gfg)$$0.a.fromJson($$1, gfg.class);
   }

   public gfg(Map<String, gfn> $$0, gfs $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public gfg(List<gfg> $$0) {
      gfg $$1 = null;

      for (gfg $$2 : $$0) {
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
   public gfn b(String $$0) {
      gfn $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new gfg.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof gfg $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, gfn> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<gfn> b() {
      Set<gfn> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public gfs d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(gfg.class, new gfg.b())
         .registerTypeAdapter(gfo.class, new gfo.a())
         .registerTypeAdapter(gfn.class, new gfn.a())
         .registerTypeAdapter(gfs.class, new gfs.a(this))
         .registerTypeAdapter(gfu.class, new gfu.a())
         .create();
      private dsl<dfh, dsk> b;

      public dsl<dfh, dsk> a() {
         return this.b;
      }

      public void a(dsl<dfh, dsk> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<gfg> {
      public gfg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, gfn> $$4 = this.a($$2, $$3);
         gfs $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new gfg($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, gfn> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, gfn> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = axw.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (gfn)$$0.deserialize($$4.getValue(), gfn.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected gfs b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = axw.v($$1, "multipart");
            return (gfs)$$0.deserialize($$2, gfs.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
