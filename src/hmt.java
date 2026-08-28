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

public class hmt {
   private static final Logger a = LogUtils.getLogger();
   private static final alk b = alk.a("blockstates");

   public static CompletableFuture<hmt.b> a(avo $$0, Executor $$1) {
      Function<alr, ebr<dno, ebq>> $$2 = hms.a();
      return CompletableFuture.<Map<alr, List<avm>>>supplyAsync(() -> b.b($$0), $$1).thenCompose($$2x -> {
         List<CompletableFuture<hmt.b>> $$3 = new ArrayList<>($$2x.size());

         for (Entry<alr, List<avm>> $$4 : $$2x.entrySet()) {
            $$3.add(CompletableFuture.supplyAsync(() -> {
               alr $$2xx = b.b($$4.getKey());
               ebr<dno, ebq> $$3x = $$2.apply($$2xx);
               if ($$3x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$2xx);
                  return null;
               } else {
                  List<avm> $$4x = $$4.getValue();
                  List<hmt.a> $$5 = new ArrayList<>($$4x.size());

                  for (avm $$6 : $$4x) {
                     try (Reader $$7 = $$6.e()) {
                        JsonElement $$8 = JsonParser.parseReader($$7);
                        gsy $$9 = (gsy)gsy.a.parse(JsonOps.INSTANCE, $$8).getOrThrow(JsonParseException::new);
                        $$5.add(new hmt.a($$6.b(), $$9));
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
            Map<ebq, gta.c> $$1xx = new IdentityHashMap<>();

            for (hmt.b $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new hmt.b($$1xx);
         });
      });
   }

   private static hmt.b a(alr $$0, ebr<dno, ebq> $$1, List<hmt.a> $$2) {
      Map<ebq, gta.c> $$3 = new IdentityHashMap<>();

      for (hmt.a $$4 : $$2) {
         $$3.putAll($$4.b.a($$1, () -> $$0 + "/" + $$4.a));
      }

      return new hmt.b($$3);
   }

   static record a(String a, gsy b) {
   }

   public static record b(Map<ebq, gta.c> a) {
   }
}
