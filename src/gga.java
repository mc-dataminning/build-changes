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

public class gga {
   private final Map<String, ggh> a = Maps.newLinkedHashMap();
   private ggm b;

   public static gga a(gga.a $$0, Reader $$1) {
      return aye.a($$0.a, $$1, gga.class);
   }

   public static gga a(gga.a $$0, JsonElement $$1) {
      return (gga)$$0.a.fromJson($$1, gga.class);
   }

   public gga(Map<String, ggh> $$0, ggm $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public gga(List<gga> $$0) {
      gga $$1 = null;

      for (gga $$2 : $$0) {
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
   public ggh b(String $$0) {
      ggh $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new gga.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof gga $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, ggh> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<ggh> b() {
      Set<ggh> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public ggm d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(gga.class, new gga.b())
         .registerTypeAdapter(ggi.class, new ggi.a())
         .registerTypeAdapter(ggh.class, new ggh.a())
         .registerTypeAdapter(ggm.class, new ggm.a(this))
         .registerTypeAdapter(ggo.class, new ggo.a())
         .create();
      private dtd<dfy, dtc> b;

      public dtd<dfy, dtc> a() {
         return this.b;
      }

      public void a(dtd<dfy, dtc> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<gga> {
      public gga a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, ggh> $$4 = this.a($$2, $$3);
         ggm $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new gga($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, ggh> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, ggh> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = aye.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (ggh)$$0.deserialize($$4.getValue(), ggh.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected ggm b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = aye.v($$1, "multipart");
            return (ggm)$$0.deserialize($$2, ggm.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
