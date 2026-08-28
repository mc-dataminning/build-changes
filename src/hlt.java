import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.io.Reader;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import org.slf4j.Logger;

public class hlt {
   private static final Logger a = LogUtils.getLogger();
   private static final akz b = akz.a("blockstates");

   public static CompletableFuture<hlt.b> a(avd $$0, Executor $$1) {
      Function<alg, eau<dmr, eat>> $$2 = hls.a();
      return CompletableFuture.<Map<alg, List<avb>>>supplyAsync(() -> b.b($$0), $$1).thenCompose($$2x -> {
         List<CompletableFuture<hlt.b>> $$3 = new ArrayList<>($$2x.size());

         for (Entry<alg, List<avb>> $$4 : $$2x.entrySet()) {
            $$3.add(CompletableFuture.supplyAsync(() -> {
               alg $$2xx = b.b($$4.getKey());
               eau<dmr, eat> $$3x = $$2.apply($$2xx);
               if ($$3x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$2xx);
                  return null;
               } else {
                  List<avb> $$4x = $$4.getValue();
                  List<hlt.a> $$5 = new ArrayList<>($$4x.size());

                  for (avb $$6 : $$4x) {
                     try (Reader $$7 = $$6.e()) {
                        JsonElement $$8 = JsonParser.parseReader($$7);
                        gsc $$9 = (gsc)gsc.a.parse(JsonOps.INSTANCE, $$8).getOrThrow(JsonParseException::new);
                        $$5.add(new hlt.a($$6.b(), $$9));
                     } catch (Exception var14) {
                        a.error("Failed to load blockstate definition {} from pack {}", new Object[]{$$2xx, $$6.b(), var14});
                     }
                  }

                  try {
                     return a($$2xx, $$3x, $$5);
                  } catch (Exception var11) {
                     a.error("Failed to load blockstate definition {}", $$2xx, var11);
                     return null;
                  }
               }
            }, $$1));
         }

         return ag.d($$3).thenApply($$0xx -> {
            Map<eat, gsd.a> $$1xx = new IdentityHashMap<>();

            for (hlt.b $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new hlt.b($$1xx);
         });
      });
   }

   private static hlt.b a(alg $$0, eau<dmr, eat> $$1, List<hlt.a> $$2) {
      Map<eat, gsd.a> $$3 = new IdentityHashMap<>();

      for (hlt.a $$4 : $$2) {
         $$3.putAll($$4.b.a($$1, () -> $$0 + "/" + $$4.a));
      }

      return new hlt.b($$3);
   }

   static record a(String a, gsc b) {
   }

   public static record b(Map<eat, gsd.a> a) {
   }
}
