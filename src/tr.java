import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public record tr(List<String> c, Map<String, String> d) {
   private static final Logger e = LogUtils.getLogger();
   public static final tr a = new tr(List.of(), Map.of());
   public static final Codec<tr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.listOf().fieldOf("removed").forGetter(tr::b), Codec.unboundedMap(Codec.STRING, Codec.STRING).fieldOf("renamed").forGetter(tr::c)
            )
            .apply($$0, tr::new)
   );

   public static tr a(InputStream $$0) {
      JsonElement $$1 = JsonParser.parseReader(new InputStreamReader($$0, StandardCharsets.UTF_8));
      return (tr)b.parse(JsonOps.INSTANCE, $$1).getOrThrow($$0x -> new IllegalStateException("Failed to parse deprecated language data: " + $$0x));
   }

   public static tr a(String $$0) {
      try (InputStream $$1 = ts.class.getResourceAsStream($$0)) {
         return $$1 != null ? a($$1) : a;
      } catch (Exception var6) {
         e.error("Failed to read {}", $$0, var6);
         return a;
      }
   }

   public static tr a() {
      return a("/assets/minecraft/lang/deprecated.json");
   }

   public void a(Map<String, String> $$0) {
      for (String $$1 : this.c) {
         $$0.remove($$1);
      }

      this.d.forEach(($$1x, $$2) -> {
         String $$3 = $$0.remove($$1x);
         if ($$3 == null) {
            e.warn("Missing translation key for rename: {}", $$1x);
            $$0.remove($$2);
         } else {
            $$0.put($$2, $$3);
         }
      });
   }

   public List<String> b() {
      return this.c;
   }

   public Map<String, String> c() {
      return this.d;
   }
}
