import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import org.slf4j.Logger;

public abstract class sv {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new Gson();
   private static final Pattern d = Pattern.compile("%(\\d+\\$)?[\\d.]*[df]");
   public static final String a = "en_us";
   private static volatile sv e = c();

   private static sv c() {
      Builder<String, String> $$0 = ImmutableMap.builder();
      BiConsumer<String, String> $$1 = $$0::put;
      a($$1, "/assets/minecraft/lang/en_us.json");
      final Map<String, String> $$2 = $$0.build();
      return new sv() {
         @Override
         public String a(String $$0, String $$1) {
            return $$2.getOrDefault($$0, $$1);
         }

         @Override
         public boolean b(String $$0) {
            return $$2.containsKey($$0);
         }

         @Override
         public boolean b() {
            return false;
         }

         @Override
         public awi a(vz $$0) {
            return $$1 -> $$0.a(($$1x, $$2xxx) -> axp.c($$2xxx, $$1x, $$1) ? Optional.empty() : vz.a, wr.a).isPresent();
         }
      };
   }

   private static void a(BiConsumer<String, String> $$0, String $$1) {
      try (InputStream $$2 = sv.class.getResourceAsStream($$1)) {
         a($$2, $$0);
      } catch (JsonParseException | IOException var7) {
         b.error("Couldn't read strings from {}", $$1, var7);
      }
   }

   public static void a(InputStream $$0, BiConsumer<String, String> $$1) {
      JsonObject $$2 = (JsonObject)c.fromJson(new InputStreamReader($$0, StandardCharsets.UTF_8), JsonObject.class);

      for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
         String $$4 = d.matcher(awm.a($$3.getValue(), $$3.getKey())).replaceAll("%$1s");
         $$1.accept($$3.getKey(), $$4);
      }
   }

   public static sv a() {
      return e;
   }

   public static void a(sv $$0) {
      e = $$0;
   }

   public String a(String $$0) {
      return this.a($$0, $$0);
   }

   public abstract String a(String var1, String var2);

   public abstract boolean b(String var1);

   public abstract boolean b();

   public abstract awi a(vz var1);

   public List<awi> a(List<vz> $$0) {
      return $$0.stream().map(this::a).collect(ImmutableList.toImmutableList());
   }
}
