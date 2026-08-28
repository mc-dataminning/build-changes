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

public class ges {
   private final Map<String, gez> a = Maps.newLinkedHashMap();
   private gfe b;

   public static ges a(ges.a $$0, Reader $$1) {
      return ayp.a($$0.a, $$1, ges.class);
   }

   public static ges a(ges.a $$0, JsonElement $$1) {
      return (ges)$$0.a.fromJson($$1, ges.class);
   }

   public ges(Map<String, gez> $$0, gfe $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public ges(List<ges> $$0) {
      ges $$1 = null;

      for (ges $$2 : $$0) {
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
   public gez b(String $$0) {
      gez $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new ges.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ges $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, gez> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<gez> b() {
      Set<gez> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public gfe d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(ges.class, new ges.b())
         .registerTypeAdapter(gfa.class, new gfa.a())
         .registerTypeAdapter(gez.class, new gez.a())
         .registerTypeAdapter(gfe.class, new gfe.a(this))
         .registerTypeAdapter(gfg.class, new gfg.a())
         .create();
      private dse<dfa, dsd> b;

      public dse<dfa, dsd> a() {
         return this.b;
      }

      public void a(dse<dfa, dsd> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<ges> {
      public ges a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, gez> $$4 = this.a($$2, $$3);
         gfe $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new ges($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, gez> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, gez> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = ayp.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (gez)$$0.deserialize($$4.getValue(), gez.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected gfe b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = ayp.v($$1, "multipart");
            return (gfe)$$0.deserialize($$2, gfe.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
