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

public class gfw {
   private final Map<String, ggd> a = Maps.newLinkedHashMap();
   private ggi b;

   public static gfw a(gfw.a $$0, Reader $$1) {
      return ayd.a($$0.a, $$1, gfw.class);
   }

   public static gfw a(gfw.a $$0, JsonElement $$1) {
      return (gfw)$$0.a.fromJson($$1, gfw.class);
   }

   public gfw(Map<String, ggd> $$0, ggi $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public gfw(List<gfw> $$0) {
      gfw $$1 = null;

      for (gfw $$2 : $$0) {
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
   public ggd b(String $$0) {
      ggd $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new gfw.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof gfw $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, ggd> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<ggd> b() {
      Set<ggd> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public ggi d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(gfw.class, new gfw.b())
         .registerTypeAdapter(gge.class, new gge.a())
         .registerTypeAdapter(ggd.class, new ggd.a())
         .registerTypeAdapter(ggi.class, new ggi.a(this))
         .registerTypeAdapter(ggk.class, new ggk.a())
         .create();
      private dtb<dfw, dta> b;

      public dtb<dfw, dta> a() {
         return this.b;
      }

      public void a(dtb<dfw, dta> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<gfw> {
      public gfw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, ggd> $$4 = this.a($$2, $$3);
         ggi $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new gfw($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, ggd> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, ggd> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = ayd.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (ggd)$$0.deserialize($$4.getValue(), ggd.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected ggi b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = ayd.v($$1, "multipart");
            return (ggi)$$0.deserialize($$2, ggi.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
