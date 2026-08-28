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

public class hiv {
   private static final Logger a = LogUtils.getLogger();
   private static final akw b = akw.a("items");

   public static CompletableFuture<hiv.a> a(ava $$0, Executor $$1) {
      return CompletableFuture.<Map<ald, auy>>supplyAsync(() -> b.a($$0), $$1)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<hiv.b>> $$2 = new ArrayList<>($$1x.size());
               $$1x.forEach(
                  ($$2x, $$3) -> $$2.add(
                        CompletableFuture.supplyAsync(
                           () -> {
                              ald $$2xx = b.b($$2x);

                              try {
                                 hiv.b var5;
                                 try (Reader $$3x = $$3.e()) {
                                    hdg $$4 = (hdg)hdg.a
                                       .parse(JsonOps.INSTANCE, JsonParser.parseReader($$3x))
                                       .ifError(
                                          $$2xxx -> a.error("Couldn't parse item model '{}' from pack '{}': {}", new Object[]{$$2xx, $$3.b(), $$2xxx.message()})
                                       )
                                       .result()
                                       .orElse(null);
                                    var5 = new hiv.b($$2xx, $$4);
                                 }

                                 return var5;
                              } catch (Exception var8) {
                                 a.error("Failed to open item model {} from pack '{}'", new Object[]{$$2x, $$3.b(), var8});
                                 return new hiv.b($$2xx, null);
                              }
                           },
                           $$1
                        )
                     )
               );
               return af.d($$2).thenApply($$0xx -> {
                  Map<ald, hdg> $$1xx = new HashMap<>();

                  for (hiv.b $$2x : $$0xx) {
                     if ($$2x.b != null) {
                        $$1xx.put($$2x.a, $$2x.b);
                     }
                  }

                  return new hiv.a($$1xx);
               });
            }
         );
   }

   public static record a(Map<ald, hdg> a) {
   }

   static record b(ald a, @Nullable hdg b) {
   }
}
