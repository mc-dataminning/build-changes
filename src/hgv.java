import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
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

public class hgv {
   private static final Logger a = LogUtils.getLogger();
   private static final ako b = ako.a("items");

   public static CompletableFuture<hgv.a> a(aup $$0, Executor $$1) {
      return CompletableFuture.<Map<akv, aun>>supplyAsync(() -> b.a($$0), $$1)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<hgv.b>> $$2 = new ArrayList<>($$1x.size());
               $$1x.forEach(
                  ($$2x, $$3) -> $$2.add(
                        CompletableFuture.supplyAsync(
                           () -> {
                              akv $$2xx = b.b($$2x);

                              try {
                                 hgv.b var5;
                                 try (Reader $$3x = $$3.e()) {
                                    hbh $$4 = (hbh)hbh.a
                                       .parse(JsonOps.INSTANCE, JsonParser.parseReader($$3x))
                                       .ifError(
                                          $$2xxx -> a.error("Couldn't parse item model '{}' from pack '{}': {}", new Object[]{$$2xx, $$3.b(), $$2xxx.message()})
                                       )
                                       .result()
                                       .orElse(null);
                                    var5 = new hgv.b($$2xx, $$4);
                                 }

                                 return var5;
                              } catch (Exception var8) {
                                 a.error("Failed to open item model {} from pack '{}'", new Object[]{$$2x, $$3.b(), var8});
                                 return new hgv.b($$2xx, null);
                              }
                           },
                           $$1
                        )
                     )
               );
               return af.d($$2).thenApply($$0xx -> {
                  Map<akv, hbh> $$1xx = new HashMap<>();

                  for (hgv.b $$2x : $$0xx) {
                     if ($$2x.b != null) {
                        $$1xx.put($$2x.a, $$2x.b);
                     }
                  }

                  return new hgv.a($$1xx);
               });
            }
         );
   }

   public static record a(Map<akv, hbh> a) {
   }

   static record b(akv a, @Nullable hbh b) {
   }
}
