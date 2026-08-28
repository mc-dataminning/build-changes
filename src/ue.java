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

public record ue(List<String> c, Map<String, String> d) {
   private static final Logger e = LogUtils.getLogger();
   public static final ue a = new ue(List.of(), Map.of());
   public static final Codec<ue> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.listOf().fieldOf("removed").forGetter(ue::b), Codec.unboundedMap(Codec.STRING, Codec.STRING).fieldOf("renamed").forGetter(ue::c)
            )
            .apply($$0, ue::new)
   );

   public static ue a(InputStream $$0) {
      JsonElement $$1 = JsonParser.parseReader(new InputStreamReader($$0, StandardCharsets.UTF_8));
      return (ue)b.parse(JsonOps.INSTANCE, $$1).getOrThrow($$0x -> new IllegalStateException("Failed to parse deprecated language data: " + $$0x));
   }

   public static ue a(String $$0) {
      try (InputStream $$1 = uf.class.getResourceAsStream($$0)) {
         return $$1 != null ? a($$1) : a;
      } catch (Exception var6) {
         e.error("Failed to read {}", $$0, var6);
         return a;
      }
   }

   public static ue a() {
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
