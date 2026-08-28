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

public class hnf {
   private static final Logger a = LogUtils.getLogger();
   private static final ald b = ald.a("blockstates");

   public static CompletableFuture<hnf.b> a(avh $$0, Executor $$1) {
      Function<alk, ebh<dne, ebg>> $$2 = hne.a();
      return CompletableFuture.<Map<alk, List<avf>>>supplyAsync(() -> b.b($$0), $$1).thenCompose($$2x -> {
         List<CompletableFuture<hnf.b>> $$3 = new ArrayList<>($$2x.size());

         for (Entry<alk, List<avf>> $$4 : $$2x.entrySet()) {
            $$3.add(CompletableFuture.supplyAsync(() -> {
               alk $$2xx = b.b($$4.getKey());
               ebh<dne, ebg> $$3x = $$2.apply($$2xx);
               if ($$3x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$2xx);
                  return null;
               } else {
                  List<avf> $$4x = $$4.getValue();
                  List<hnf.a> $$5 = new ArrayList<>($$4x.size());

                  for (avf $$6 : $$4x) {
                     try (Reader $$7 = $$6.e()) {
                        JsonElement $$8 = JsonParser.parseReader($$7);
                        gtn $$9 = (gtn)gtn.a.parse(JsonOps.INSTANCE, $$8).getOrThrow(JsonParseException::new);
                        $$5.add(new hnf.a($$6.b(), $$9));
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
            Map<ebg, gtp.c> $$1xx = new IdentityHashMap<>();

            for (hnf.b $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new hnf.b($$1xx);
         });
      });
   }

   private static hnf.b a(alk $$0, ebh<dne, ebg> $$1, List<hnf.a> $$2) {
      Map<ebg, gtp.c> $$3 = new IdentityHashMap<>();

      for (hnf.a $$4 : $$2) {
         $$3.putAll($$4.b.a($$1, () -> $$0 + "/" + $$4.a));
      }

      return new hnf.b($$3);
   }

   static record a(String a, gtn b) {
   }

   public static record b(Map<ebg, gtp.c> a) {
   }
}
