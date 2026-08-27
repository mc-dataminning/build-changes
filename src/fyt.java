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

public class fyt {
   private final Map<String, fza> a = Maps.newLinkedHashMap();
   private fzf b;

   public static fyt a(fyt.a $$0, Reader $$1) {
      return awm.a($$0.a, $$1, fyt.class);
   }

   public static fyt a(fyt.a $$0, JsonElement $$1) {
      return (fyt)$$0.a.fromJson($$1, fyt.class);
   }

   public fyt(Map<String, fza> $$0, fzf $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fyt(List<fyt> $$0) {
      fyt $$1 = null;

      for (fyt $$2 : $$0) {
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
   public fza b(String $$0) {
      fza $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fyt.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fyt $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fza> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fza> b() {
      Set<fza> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fzf d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fyt.class, new fyt.b())
         .registerTypeAdapter(fzb.class, new fzb.a())
         .registerTypeAdapter(fza.class, new fza.a())
         .registerTypeAdapter(fzf.class, new fzf.a(this))
         .registerTypeAdapter(fzh.class, new fzh.a())
         .create();
      private dna<daa, dmz> b;

      public dna<daa, dmz> a() {
         return this.b;
      }

      public void a(dna<daa, dmz> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fyt> {
      public fyt a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fza> $$4 = this.a($$2, $$3);
         fzf $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fyt($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fza> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fza> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = awm.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fza)$$0.deserialize($$4.getValue(), fza.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fzf b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = awm.v($$1, "multipart");
            return (fzf)$$0.deserialize($$2, fzf.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
