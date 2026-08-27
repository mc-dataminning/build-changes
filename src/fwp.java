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

public class fwp {
   private final Map<String, fww> a = Maps.newLinkedHashMap();
   private fxb b;

   public static fwp a(fwp.a $$0, Reader $$1) {
      return avx.a($$0.a, $$1, fwp.class);
   }

   public static fwp a(fwp.a $$0, JsonElement $$1) {
      return (fwp)$$0.a.fromJson($$1, fwp.class);
   }

   public fwp(Map<String, fww> $$0, fxb $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public fwp(List<fwp> $$0) {
      fwp $$1 = null;

      for (fwp $$2 : $$0) {
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
   public fww b(String $$0) {
      fww $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new fwp.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof fwp $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, fww> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<fww> b() {
      Set<fww> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public fxb d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(fwp.class, new fwp.b())
         .registerTypeAdapter(fwx.class, new fwx.a())
         .registerTypeAdapter(fww.class, new fww.a())
         .registerTypeAdapter(fxb.class, new fxb.a(this))
         .registerTypeAdapter(fxd.class, new fxd.a())
         .create();
      private dlg<cyo, dlf> b;

      public dlg<cyo, dlf> a() {
         return this.b;
      }

      public void a(dlg<cyo, dlf> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<fwp> {
      public fwp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, fww> $$4 = this.a($$2, $$3);
         fxb $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new fwp($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, fww> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, fww> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = avx.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (fww)$$0.deserialize($$4.getValue(), fww.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected fxb b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = avx.v($$1, "multipart");
            return (fxb)$$0.deserialize($$2, fxb.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
