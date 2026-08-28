import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import org.slf4j.Logger;

public abstract class uh {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new Gson();
   private static final Pattern d = Pattern.compile("%(\\d+\\$)?[\\d.]*[df]");
   public static final String a = "en_us";
   private static volatile uh e = c();

   private static uh c() {
      ug $$0 = ug.a();
      Map<String, String> $$1 = new HashMap<>();
      BiConsumer<String, String> $$2 = $$1::put;
      a($$2, "/assets/minecraft/lang/en_us.json");
      $$0.a($$1);
      final Map<String, String> $$3 = Map.copyOf($$1);
      return new uh() {
         @Override
         public String a(String $$0, String $$1) {
            return $$3.getOrDefault($$0, $$1);
         }

         @Override
         public boolean b(String $$0) {
            return $$3.containsKey($$0);
         }

         @Override
         public boolean b() {
            return false;
         }

         @Override
         public azg a(xp $$0) {
            return $$1 -> $$0.a(($$1x, $$2) -> bap.c($$2, $$1x, $$1) ? Optional.empty() : xp.a, yh.a).isPresent();
         }
      };
   }

   private static void a(BiConsumer<String, String> $$0, String $$1) {
      try (InputStream $$2 = uh.class.getResourceAsStream($$1)) {
         a($$2, $$0);
      } catch (JsonParseException | IOException var7) {
         b.error("Couldn't read strings from {}", $$1, var7);
      }
   }

   public static void a(InputStream $$0, BiConsumer<String, String> $$1) {
      JsonObject $$2 = (JsonObject)c.fromJson(new InputStreamReader($$0, StandardCharsets.UTF_8), JsonObject.class);

      for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
         String $$4 = d.matcher(azk.a($$3.getValue(), $$3.getKey())).replaceAll("%$1s");
         $$1.accept($$3.getKey(), $$4);
      }
   }

   public static uh a() {
      return e;
   }

   public static void a(uh $$0) {
      e = $$0;
   }

   public String a(String $$0) {
      return this.a($$0, $$0);
   }

   public abstract String a(String var1, String var2);

   public abstract boolean b(String var1);

   public abstract boolean b();

   public abstract azg a(xp var1);

   public List<azg> a(List<xp> $$0) {
      return $$0.stream().map(this::a).collect(ImmutableList.toImmutableList());
   }
}
