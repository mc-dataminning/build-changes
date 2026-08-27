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

public class fuk {
   private final Map<String, fur> a = Maps.newLinkedHashMap();
   private fuw b;

   public static fuk a(fuk.a $$0, Reader $$1) {
      return aue.a($$0.a, $$1, fuk.class);
   }

   public static fuk a(fuk.a $$0, JsonElement $$1) {
      return (fuk)$$0.a.fromJson($$1, fuk.class);
   }

   public fuk(Map<String, fur> $$0, fuw $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fuk(List<fuk> $$0) {
      fuk $$1 = null;

      for (fuk $$2 : $$0) {
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
   public fur b(String $$0) {
      fur $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fuk.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fuk $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fur> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fur> b() {
      Set<fur> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fuw d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fuk.class, new fuk.b())
         .registerTypeAdapter(fus.class, new fus.a())
         .registerTypeAdapter(fur.class, new fur.a())
         .registerTypeAdapter(fuw.class, new fuw.a(this))
         .registerTypeAdapter(fuy.class, new fuy.a())
         .create();
      private dji<cwq, djh> b;

      public dji<cwq, djh> a() {
         return this.b;
      }

      public void a(dji<cwq, djh> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fuk> {
      public fuk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fur> $$4 = this.a($$2, $$3);
         fuw $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fuk($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fur> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fur> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = aue.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fur)$$0.deserialize($$4.getValue(), fur.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fuw b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = aue.v($$1, "multipart");
            return (fuw)$$0.deserialize($$2, fuw.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
