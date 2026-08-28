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

public class grf {
   private static final Logger b = LogUtils.getLogger();
   public static final Gson a = new GsonBuilder()
      .registerTypeAdapter(grf.class, new grf.a())
      .registerTypeAdapter(grn.class, new grn.a())
      .registerTypeAdapter(grk.class, new grk.a())
      .registerTypeAdapter(grs.b.class, new grs.c())
      .registerTypeAdapter(gru.class, new gru.a())
      .create();
   private final Map<String, grk> c;
   @Nullable
   private final grs.b d;

   public static grf a(Reader $$0) {
      return azc.a(a, $$0, grf.class);
   }

   public static grf a(JsonElement $$0) {
      return (grf)a.fromJson($$0, grf.class);
   }

   public grf(Map<String, grk> $$0, @Nullable grs.b $$1) {
      this.d = $$1;
      this.c = $$0;
   }

   @VisibleForTesting
   public grk a(String $$0) {
      grk $$1 = this.c.get($$0);
      if ($$1 == null) {
         throw new grf.b();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof grf $$1) ? false : this.c.equals($$1.c) && Objects.equals(this.d, $$1.d);
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.c.hashCode() + (this.d != null ? this.d.hashCode() : 0);
   }

   @VisibleForTesting
   public Set<grk> a() {
      Set<grk> $$0 = Sets.newHashSet(this.c.values());
      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0;
   }

   @Nullable
   public grs.b b() {
      return this.d;
   }

   public Map<dzz, grm> a(eaa<dma, dzz> $$0, String $$1) {
      Map<dzz, grm> $$2 = new IdentityHashMap<>();
      List<dzz> $$3 = $$0.a();
      grs $$4;
      if (this.d != null) {
         $$4 = this.d.a($$0);
         $$3.forEach($$2x -> $$2.put($$2x, $$4));
      } else {
         $$4 = null;
      }

      this.c.forEach(($$5x, $$6) -> {
         try {
            $$3.stream().filter(gro.a($$0, $$5x)).forEach($$3xx -> {
               grm $$4x = $$2.put($$3xx, $$6);
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

   public static class a implements JsonDeserializer<grf> {
      public grf a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, grk> $$4 = this.a($$2, $$3);
         grs.b $$5 = this.b($$2, $$3);
         if ($$4.isEmpty() && $$5 == null) {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         } else {
            return new grf($$4, $$5);
         }
      }

      protected Map<String, grk> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, grk> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = azc.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (grk)$$0.deserialize($$4.getValue(), grk.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected grs.b b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = azc.v($$1, "multipart");
            return (grs.b)$$0.deserialize($$2, grs.b.class);
         }
      }
   }

   protected static class b extends RuntimeException {
   }
}
