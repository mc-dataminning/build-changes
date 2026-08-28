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

public class hgr {
   private static final Logger a = LogUtils.getLogger();
   private static final akn b = akn.a("items");

   public static CompletableFuture<hgr.a> a(aup $$0, Executor $$1) {
      return CompletableFuture.<Map<aku, aun>>supplyAsync(() -> b.a($$0), $$1)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<hgr.b>> $$2 = new ArrayList<>($$1x.size());
               $$1x.forEach(
                  ($$2x, $$3) -> $$2.add(
                        CompletableFuture.supplyAsync(
                           () -> {
                              aku $$2xx = b.b($$2x);

                              try {
                                 hgr.b var5;
                                 try (Reader $$3x = $$3.e()) {
                                    hbi.b $$4 = hbf.a
                                       .parse(JsonOps.INSTANCE, JsonParser.parseReader($$3x))
                                       .ifError(
                                          $$2xxx -> a.error("Couldn't parse item model '{}' from pack '{}': {}", new Object[]{$$2xx, $$3.b(), $$2xxx.message()})
                                       )
                                       .result()
                                       .map(hbf::a)
                                       .orElse(null);
                                    var5 = new hgr.b($$2xx, $$4);
                                 }

                                 return var5;
                              } catch (Exception var8) {
                                 a.error("Failed to open item model {} from pack '{}'", new Object[]{$$2x, $$3.b(), var8});
                                 return new hgr.b($$2xx, null);
                              }
                           },
                           $$1
                        )
                     )
               );
               return af.d($$2).thenApply($$0xx -> {
                  Map<aku, hbi.b> $$1xx = new HashMap<>();

                  for (hgr.b $$2x : $$0xx) {
                     if ($$2x.b != null) {
                        $$1xx.put($$2x.a, $$2x.b);
                     }
                  }

                  return new hgr.a($$1xx);
               });
            }
         );
   }

   public static record a(Map<aku, hbi.b> a) {
   }

   static record b(aku a, @Nullable hbi.b b) {
   }
}
