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

public class gmy {
   private static final Logger b = LogUtils.getLogger();
   public static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gmy.class, new gmy.a())
      .registerTypeAdapter(gng.class, new gng.a())
      .registerTypeAdapter(gne.class, new gne.a())
      .registerTypeAdapter(gnl.b.class, new gnl.c())
      .registerTypeAdapter(gnn.class, new gnn.a())
      .create();
   private final Map<String, gne> c;
   @Nullable
   private final gnl.b d;

   public static gmy a(Reader $$0) {
      return azu.a(a, $$0, gmy.class);
   }

   public static gmy a(JsonElement $$0) {
      return (gmy)a.fromJson($$0, gmy.class);
   }

   public gmy(Map<String, gne> $$0, @Nullable gnl.b $$1) {
      this.d = $$1;
      this.c = $$0;
   }

   @VisibleForTesting
   public gne a(String $$0) {
      gne $$1 = this.c.get($$0);
      if ($$1 == null) {
         throw new gmy.b();
      } else {
         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof gmy $$1) ? false : this.c.equals($$1.c) && Objects.equals(this.d, $$1.d);
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.c.hashCode() + (this.d != null ? this.d.hashCode() : 0);
   }

   @VisibleForTesting
   public Set<gne> a() {
      Set<gne> $$0 = Sets.newHashSet(this.c.values());
      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0;
   }

   @Nullable
   public gnl.b b() {
      return this.d;
   }

   public Map<dxv, gnf> a(dxw<dkm, dxv> $$0, String $$1) {
      Map<dxv, gnf> $$2 = new IdentityHashMap<>();
      List<dxv> $$3 = $$0.a();
      gnl $$4;
      if (this.d != null) {
         $$4 = this.d.a($$0);
         $$3.forEach($$2x -> $$2.put($$2x, $$4));
      } else {
         $$4 = null;
      }

      this.c.forEach(($$5x, $$6) -> {
         try {
            $$3.stream().filter(gnh.a($$0, $$5x)).forEach($$3xx -> {
               heg $$4x = $$2.put($$3xx, $$6);
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

   public static class a implements JsonDeserializer<gmy> {
      public gmy a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Map<String, gne> $$4 = this.a($$2, $$3);
         gnl.b $$5 = this.b($$2, $$3);
         if ($$4.isEmpty() && $$5 == null) {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
         } else {
            return new gmy($$4, $$5);
         }
      }

      protected Map<String, gne> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<String, gne> $$2 = Maps.newHashMap();
         if ($$1.has("variants")) {
            JsonObject $$3 = azu.u($$1, "variants");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), (gne)$$0.deserialize($$4.getValue(), gne.class));
            }
         }

         return $$2;
      }

      @Nullable
      protected gnl.b b(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("multipart")) {
            return null;
         } else {
            JsonArray $$2 = azu.v($$1, "multipart");
            return (gnl.b)$$0.deserialize($$2, gnl.b.class);
         }
      }
   }

   protected static class b extends RuntimeException {
   }
}
