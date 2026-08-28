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

public class gep {
   private final Map<String, gew> a = Maps.newLinkedHashMap();
   private gfb b;

   public static gep a(gep.a $$0, Reader $$1) {
      return ayn.a($$0.a, $$1, gep.class);
   }

   public static gep a(gep.a $$0, JsonElement $$1) {
      return (gep)$$0.a.fromJson($$1, gep.class);
   }

   public gep(Map<String, gew> $$0, gfb $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public gep(List<gep> $$0) {
      gep $$1 = null;

      for (gep $$2 : $$0) {
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
   public gew b(String $$0) {
      gew $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new gep.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof gep $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, gew> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<gew> b() {
      Set<gew> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public gfb d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(gep.class, new gep.b())
         .registerTypeAdapter(gex.class, new gex.a())
         .registerTypeAdapter(gew.class, new gew.a())
         .registerTypeAdapter(gfb.class, new gfb.a(this))
         .registerTypeAdapter(gfd.class, new gfd.a())
         .create();
      private dsb<dex, dsa> b;

      public dsb<dex, dsa> a() {
         return this.b;
      }

      public void a(dsb<dex, dsa> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<gep> {
      public gep a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, gew> $$4 = this.a($$2, $$3);
         gfb $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new gep($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, gew> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, gew> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = ayn.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (gew)$$0.deserialize($$4.getValue(), gew.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected gfb b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = ayn.v($$1, "multipart");
            return (gfb)$$0.deserialize($$2, gfb.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
