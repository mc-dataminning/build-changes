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
import com.mojang.logging.LogUtils;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gnl {
   private static final Logger b = LogUtils.getLogger();
   public static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gnl.class, new gnl.a())
      .registerTypeAdapter(gnt.class, new gnt.a())
      .registerTypeAdapter(gnq.class, new gnq.a())
      .registerTypeAdapter(gny.b.class, new gny.c())
      .registerTypeAdapter(goa.class, new goa.a())
      .create();
   private final Map<String, gnq> c;
   @Nullable
   private final gny.b d;

   public static gnl a(Reader $$0) {
      return ayp.a(a, $$0, gnl.class);
   }

   public static gnl a(JsonElement $$0) {
      return (gnl)a.fromJson($$0, gnl.class);
   }

   public gnl(Map<String, gnq> $$0, @Nullable gny.b $$1) {
      this.d = $$1;
      this.c = $$0;
   }

   @VisibleForTesting
   public gnq a(String $$0) {
      gnq $$1 = this.c.get($$0);
      if ($$1 == null) {
         throw new gnl.b();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof gnl $$1) ? false : this.c.equals($$1.c) && Objects.equals(this.d, $$1.d);
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.c.hashCode() + (this.d != null ? this.d.hashCode() : 0);
   }

   @VisibleForTesting
   public Set<gnq> a() {
      Set<gnq> $$0 = Sets.newHashSet(this.c.values());
      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0;
   }

   @Nullable
   public gny.b b() {
      return this.d;
   }

   public Map<dwx, gns> a(dwy<djm, dwx> $$0, String $$1) {
      Map<dwx, gns> $$2 = new IdentityHashMap<>();
      List<dwx> $$3 = $$0.a();
      gny $$4;
      if (this.d != null) {
         $$4 = this.d.a($$0);
         $$3.forEach($$2x -> $$2.put($$2x, $$4));
      } else {
         $$4 = null;
      }

      this.c.forEach(($$5x, $$6) -> {
         try {
            $$3.stream().filter(gnu.a($$0, $$5x)).forEach($$3xx -> {
               gns $$4x = $$2.put($$3xx, $$6);
               if ($$4x != null && $$4x != $$4) {
                  String $$5xx = this.c.entrySet().stream().filter($$1xxx -> $$1xxx.getValue() == $$4).findFirst().get().getKey();
                  throw new RuntimeException("Overlapping definition with: " + $$5xx);
               }
            });
         } catch (Exception var9) {
            b.warn("Exception loading blockstate definition: '{}' for variant: '{}': {}", new Object[]{$$1, $$5x, var9.getMessage()});
         }
      });
      return $$2;
   }

   public static class a implements JsonDeserializer<gnl> {
      public gnl a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, gnq> $$4 = this.a($$2, $$3);
         gny.b $$5 = this.b($$2, $$3);
         if ($$4.isEmpty() && $$5 == null) {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         } else {
            return new gnl($$4, $$5);
         }
      }

      protected Map<String, gnq> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, gnq> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = ayp.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (gnq)$$0.deserialize($$4.getValue(), gnq.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected gny.b b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = ayp.v($$1, "multipart");
            return (gny.b)$$0.deserialize($$2, gny.b.class);
         }
      }
   }

   protected static class b extends RuntimeException {
   }
}
