import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hkc {
   private static final Logger a = LogUtils.getLogger();
   private static final akx b = akx.a("items");

   public static CompletableFuture<hkc.a> a(avb $$0, Executor $$1) {
      js.b $$2 = gjg.a().a();
      return CompletableFuture.<Map<ale, auz>>supplyAsync(() -> b.a($$0), $$1)
         .thenCompose(
            $$2x -> {
               List<CompletableFuture<hkc.b>> $$3 = new ArrayList<>($$2x.size());
               $$2x.forEach(
                  ($$3x, $$4) -> $$3.add(
                        CompletableFuture.supplyAsync(
                           () -> {
                              ale $$3xx = b.b($$3x);

                              try {
                                 hkc.b var8;
                                 try (Reader $$4x = $$4.e()) {
                                    azp $$5 = new azp($$2);
                                    DynamicOps<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
                                    hel $$7 = hel.a
                                       .parse($$6, JsonParser.parseReader($$4x))
                                       .ifError(
                                          $$2xxxx -> a.error(
                                                "Couldn't parse item model '{}' from pack '{}': {}", new Object[]{$$3xx, $$4.b(), $$2xxxx.message()}
                                             )
                                       )
                                       .result()
                                       .map($$1xxxx -> $$5.b() ? $$1xxxx.a($$5.a()) : $$1xxxx)
                                       .orElse(null);
                                    var8 = new hkc.b($$3xx, $$7);
                                 }

                                 return var8;
                              } catch (Exception var11) {
                                 a.error("Failed to open item model {} from pack '{}'", new Object[]{$$3x, $$4.b(), var11});
                                 return new hkc.b($$3xx, null);
                              }
                           },
                           $$1
                        )
                     )
               );
               return af.d($$3).thenApply($$0xx -> {
                  Map<ale, hel> $$1xx = new HashMap<>();

                  for (hkc.b $$2xx : $$0xx) {
                     if ($$2xx.b != null) {
                        $$1xx.put($$2xx.a, $$2xx.b);
                     }
                  }

                  return new hkc.a($$1xx);
               });
            }
         );
   }

   public static record a(Map<ale, hel> a) {
   }

   static record b(ale a, @Nullable hel b) {
   }
}
