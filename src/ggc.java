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

public class ggc {
   private final Map<String, ggj> a = Maps.newLinkedHashMap();
   private ggo b;

   public static ggc a(ggc.a $$0, Reader $$1) {
      return aye.a($$0.a, $$1, ggc.class);
   }

   public static ggc a(ggc.a $$0, JsonElement $$1) {
      return (ggc)$$0.a.fromJson($$1, ggc.class);
   }

   public ggc(Map<String, ggj> $$0, ggo $$1) {
      this.b = $$1;
      this.a.putAll($$0);
   }

   public ggc(List<ggc> $$0) {
      ggc $$1 = null;

      for (ggc $$2 : $$0) {
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
   public ggj b(String $$0) {
      ggj $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new ggc.c();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ggc $$1 && this.a.equals($$1.a)) {
            return this.c() ? this.b.equals($$1.b) : !$$1.c();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.a.hashCode() + (this.c() ? this.b.hashCode() : 0);
   }

   public Map<String, ggj> a() {
      return this.a;
   }

   @VisibleForTesting
   public Set<ggj> b() {
      Set<ggj> $$0 = Sets.newHashSet(this.a.values());
      if (this.c()) {
         $$0.addAll(this.b.b());
      }

      return $$0;
   }

   public boolean c() {
      return this.b != null;
   }

   public ggo d() {
      return this.b;
   }

   public static final class a {
      protected final Gson a = new GsonBuilder()
         .registerTypeAdapter(ggc.class, new ggc.b())
         .registerTypeAdapter(ggk.class, new ggk.a())
         .registerTypeAdapter(ggj.class, new ggj.a())
         .registerTypeAdapter(ggo.class, new ggo.a(this))
         .registerTypeAdapter(ggq.class, new ggq.a())
         .create();
      private dtd<dfy, dtc> b;

      public dtd<dfy, dtc> a() {
         return this.b;
      }

      public void a(dtd<dfy, dtc> $$0) {
         this.b = $$0;
      }
   }

   public static class b implements JsonDeserializer<ggc> {
      public ggc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, ggj> $$4 = this.a($$2, $$3);
         ggo $$5 = this.b($$2, $$3);
         if (!$$4.isEmpty() || $$5 != null && !$$5.b().isEmpty()) {
            return new ggc($$4, $$5);
         } else {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         }
      }

      protected Map<String, ggj> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, ggj> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = aye.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (ggj)$$0.deserialize($$4.getValue(), ggj.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected ggo b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = aye.v($$1, "multipart");
            return (ggo)$$0.deserialize($$2, ggo.class);
         }
      }
   }

   protected class c extends RuntimeException {
   }
}
