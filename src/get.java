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

public class get {
   private final Map<String, gfa> a = Maps.newLinkedHashMap();
   private gff b;

   public static get a(get.a $$0, Reader $$1) {
      return ayp.a($$0.a, $$1, get.class);
   }

   public static get a(get.a $$0, JsonElement $$1) {
      return (get)$$0.a.fromJson($$1, get.class);
   }

   public get(Map<String, gfa> $$0, gff $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public get(List<get> $$0) {
      get $$1 = null;

      for (get $$2 : $$0) {
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
   public gfa b(String $$0) {
      gfa $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new get.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof get $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, gfa> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<gfa> b() {
      Set<gfa> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public gff d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(get.class, new get.b())
         .registerTypeAdapter(gfb.class, new gfb.a())
         .registerTypeAdapter(gfa.class, new gfa.a())
         .registerTypeAdapter(gff.class, new gff.a(this))
         .registerTypeAdapter(gfh.class, new gfh.a())
         .create();
      private dsf<dfb, dse> b;

      public dsf<dfb, dse> a() {
         return this.b;
      }

      public void a(dsf<dfb, dse> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<get> {
      public get a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, gfa> $$4 = this.a($$2, $$3);
         gff $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new get($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, gfa> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, gfa> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = ayp.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (gfa)$$0.deserialize($$4.getValue(), gfa.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected gff b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = ayp.v($$1, "multipart");
            return (gff)$$0.deserialize($$2, gff.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
