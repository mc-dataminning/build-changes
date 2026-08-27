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

public class fxt {
   private final Map<String, fya> a = Maps.newLinkedHashMap();
   private fyf b;

   public static fxt a(fxt.a $$0, Reader $$1) {
      return awc.a($$0.a, $$1, fxt.class);
   }

   public static fxt a(fxt.a $$0, JsonElement $$1) {
      return (fxt)$$0.a.fromJson($$1, fxt.class);
   }

   public fxt(Map<String, fya> $$0, fyf $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fxt(List<fxt> $$0) {
      fxt $$1 = null;

      for (fxt $$2 : $$0) {
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
   public fya b(String $$0) {
      fya $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fxt.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fxt $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fya> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fya> b() {
      Set<fya> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fyf d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fxt.class, new fxt.b())
         .registerTypeAdapter(fyb.class, new fyb.a())
         .registerTypeAdapter(fya.class, new fya.a())
         .registerTypeAdapter(fyf.class, new fyf.a(this))
         .registerTypeAdapter(fyh.class, new fyh.a())
         .create();
      private dmf<czf, dme> b;

      public dmf<czf, dme> a() {
         return this.b;
      }

      public void a(dmf<czf, dme> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fxt> {
      public fxt a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fya> $$4 = this.a($$2, $$3);
         fyf $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fxt($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fya> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fya> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = awc.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fya)$$0.deserialize($$4.getValue(), fya.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fyf b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = awc.v($$1, "multipart");
            return (fyf)$$0.deserialize($$2, fyf.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
