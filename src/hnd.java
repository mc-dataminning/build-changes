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

public class hnd {
   private static final Logger a = LogUtils.getLogger();
   private static final alb b = alb.a("blockstates");

   public static CompletableFuture<hnd.b> a(avf $$0, Executor $$1) {
      Function<ali, ebf<dnc, ebe>> $$2 = hnc.a();
      return CompletableFuture.<Map<ali, List<avd>>>supplyAsync(() -> b.b($$0), $$1).thenCompose($$2x -> {
         List<CompletableFuture<hnd.b>> $$3 = new ArrayList<>($$2x.size());

         for (Entry<ali, List<avd>> $$4 : $$2x.entrySet()) {
            $$3.add(CompletableFuture.supplyAsync(() -> {
               ali $$2xx = b.b($$4.getKey());
               ebf<dnc, ebe> $$3x = $$2.apply($$2xx);
               if ($$3x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$2xx);
                  return null;
               } else {
                  List<avd> $$4x = $$4.getValue();
                  List<hnd.a> $$5 = new ArrayList<>($$4x.size());

                  for (avd $$6 : $$4x) {
                     try (Reader $$7 = $$6.e()) {
                        JsonElement $$8 = JsonParser.parseReader($$7);
                        gtl $$9 = (gtl)gtl.a.parse(JsonOps.INSTANCE, $$8).getOrThrow(JsonParseException::new);
                        $$5.add(new hnd.a($$6.b(), $$9));
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
            Map<ebe, gtn.c> $$1xx = new IdentityHashMap<>();

            for (hnd.b $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new hnd.b($$1xx);
         });
      });
   }

   private static hnd.b a(ali $$0, ebf<dnc, ebe> $$1, List<hnd.a> $$2) {
      Map<ebe, gtn.c> $$3 = new IdentityHashMap<>();

      for (hnd.a $$4 : $$2) {
         $$3.putAll($$4.b.a($$1, () -> $$0 + "/" + $$4.a));
      }

      return new hnd.b($$3);
   }

   static record a(String a, gtl b) {
   }

   public static record b(Map<ebe, gtn.c> a) {
   }
}
