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

public class fww {
   private final Map<String, fxd> a = Maps.newLinkedHashMap();
   private fxi b;

   public static fww a(fww.a $$0, Reader $$1) {
      return avy.a($$0.a, $$1, fww.class);
   }

   public static fww a(fww.a $$0, JsonElement $$1) {
      return (fww)$$0.a.fromJson($$1, fww.class);
   }

   public fww(Map<String, fxd> $$0, fxi $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fww(List<fww> $$0) {
      fww $$1 = null;

      for (fww $$2 : $$0) {
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
   public fxd b(String $$0) {
      fxd $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fww.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fww $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fxd> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fxd> b() {
      Set<fxd> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fxi d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fww.class, new fww.b())
         .registerTypeAdapter(fxe.class, new fxe.a())
         .registerTypeAdapter(fxd.class, new fxd.a())
         .registerTypeAdapter(fxi.class, new fxi.a(this))
         .registerTypeAdapter(fxk.class, new fxk.a())
         .create();
      private dlk<cys, dlj> b;

      public dlk<cys, dlj> a() {
         return this.b;
      }

      public void a(dlk<cys, dlj> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fww> {
      public fww a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fxd> $$4 = this.a($$2, $$3);
         fxi $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fww($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fxd> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fxd> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = avy.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fxd)$$0.deserialize($$4.getValue(), fxd.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fxi b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = avy.v($$1, "multipart");
            return (fxi)$$0.deserialize($$2, fxi.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
