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

public class fwo {
   private final Map<String, fwv> a = Maps.newLinkedHashMap();
   private fxa b;

   public static fwo a(fwo.a $$0, Reader $$1) {
      return avx.a($$0.a, $$1, fwo.class);
   }

   public static fwo a(fwo.a $$0, JsonElement $$1) {
      return (fwo)$$0.a.fromJson($$1, fwo.class);
   }

   public fwo(Map<String, fwv> $$0, fxa $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fwo(List<fwo> $$0) {
      fwo $$1 = null;

      for (fwo $$2 : $$0) {
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
   public fwv b(String $$0) {
      fwv $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fwo.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fwo $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fwv> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fwv> b() {
      Set<fwv> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fxa d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fwo.class, new fwo.b())
         .registerTypeAdapter(fww.class, new fww.a())
         .registerTypeAdapter(fwv.class, new fwv.a())
         .registerTypeAdapter(fxa.class, new fxa.a(this))
         .registerTypeAdapter(fxc.class, new fxc.a())
         .create();
      private dlg<cyo, dlf> b;

      public dlg<cyo, dlf> a() {
         return this.b;
      }

      public void a(dlg<cyo, dlf> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fwo> {
      public fwo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fwv> $$4 = this.a($$2, $$3);
         fxa $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fwo($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fwv> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fwv> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = avx.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fwv)$$0.deserialize($$4.getValue(), fwv.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fxa b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = avx.v($$1, "multipart");
            return (fxa)$$0.deserialize($$2, fxa.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
