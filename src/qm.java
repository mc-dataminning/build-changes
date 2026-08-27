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

public abstract class qm {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new Gson();
   private static final Pattern d = Pattern.compile("%(\\d+\\$)?[\\d.]*[df]");
   public static final String a = "en_us";
   private static volatile qm e = c();

   private static qm c() {
      Builder<String, String> $$0 = ImmutableMap.builder();
      BiConsumer<String, String> $$1 = $$0::put;
      a($$1, "/assets/minecraft/lang/en_us.json");
      final Map<String, String> $$2 = $$0.build();
      return new qm() {
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
         public arc a(tj $$0) {
            return $$1 -> $$0.a(($$1x, $$2xxx) -> asg.c($$2xxx, $$1x, $$1) ? Optional.empty() : tj.a, ub.a).isPresent();
         }
      };
   }

   private static void a(BiConsumer<String, String> $$0, String $$1) {
      try (InputStream $$2 = qm.class.getResourceAsStream($$1)) {
         a($$2, $$0);
      } catch (JsonParseException | IOException var7) {
         b.error("Couldn't read strings from {}", $$1, var7);
      }
   }

   public static void a(InputStream $$0, BiConsumer<String, String> $$1) {
      JsonObject $$2 = (JsonObject)c.fromJson(new InputStreamReader($$0, StandardCharsets.UTF_8), JsonObject.class);

      for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
         String $$4 = d.matcher(arg.a($$3.getValue(), $$3.getKey())).replaceAll("%$1s");
         $$1.accept($$3.getKey(), $$4);
      }
   }

   public static qm a() {
      return e;
   }

   public static void a(qm $$0) {
      e = $$0;
   }

   public String a(String $$0) {
      return this.a($$0, $$0);
   }

   public abstract String a(String var1, String var2);

   public abstract boolean b(String var1);

   public abstract boolean b();

   public abstract arc a(tj var1);

   public List<arc> a(List<tj> $$0) {
      return $$0.stream().map(this::a).collect(ImmutableList.toImmutableList());
   }
}
