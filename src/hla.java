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

public class hla {
   private static final Logger a = LogUtils.getLogger();
   private static final akz b = akz.a("items");

   public static CompletableFuture<hla.a> a(avd $$0, Executor $$1) {
      js.b $$2 = gkc.a().a();
      return CompletableFuture.<Map<alg, avb>>supplyAsync(() -> b.a($$0), $$1)
         .thenCompose(
            $$2x -> {
               List<CompletableFuture<hla.b>> $$3 = new ArrayList<>($$2x.size());
               $$2x.forEach(
                  ($$3x, $$4) -> $$3.add(
                        CompletableFuture.supplyAsync(
                           () -> {
                              alg $$3xx = b.b($$3x);

                              try {
                                 hla.b var8;
                                 try (Reader $$4x = $$4.e()) {
                                    azr $$5 = new azr($$2);
                                    DynamicOps<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
                                    hfj $$7 = hfj.a
                                       .parse($$6, JsonParser.parseReader($$4x))
                                       .ifError(
                                          $$2xxxx -> a.error(
                                                "Couldn't parse item model '{}' from pack '{}': {}", new Object[]{$$3xx, $$4.b(), $$2xxxx.message()}
                                             )
                                       )
                                       .result()
                                       .map($$1xxxx -> $$5.b() ? $$1xxxx.a($$5.a()) : $$1xxxx)
                                       .orElse(null);
                                    var8 = new hla.b($$3xx, $$7);
                                 }

                                 return var8;
                              } catch (Exception var11) {
                                 a.error("Failed to open item model {} from pack '{}'", new Object[]{$$3x, $$4.b(), var11});
                                 return new hla.b($$3xx, null);
                              }
                           },
                           $$1
                        )
                     )
               );
               return af.d($$3).thenApply($$0xx -> {
                  Map<alg, hfj> $$1xx = new HashMap<>();

                  for (hla.b $$2xx : $$0xx) {
                     if ($$2xx.b != null) {
                        $$1xx.put($$2xx.a, $$2xx.b);
                     }
                  }

                  return new hla.a($$1xx);
               });
            }
         );
   }

   public static record a(Map<alg, hfj> a) {
   }

   static record b(alg a, @Nullable hfj b) {
   }
}
