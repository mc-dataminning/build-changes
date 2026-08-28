import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class hkr {
   private static final Logger e = LogUtils.getLogger();
   private static final akz f = akz.a("blockstates");
   private static final String g = "map";
   private static final String h = "map=true";
   private static final String i = "map=false";
   private static final eaa<dma, dzz> j = new eaa.a<dma, dzz>(dmc.a).a(eaq.a("map")).a(dma::m, dzz::new);
   private static final alg k = alg.b("glow_item_frame");
   private static final alg l = alg.b("item_frame");
   private static final Map<alg, eaa<dma, dzz>> m = Map.of(l, j, k, j);
   public static final hle a = new hle(k, "map=true");
   public static final hle b = new hle(k, "map=false");
   public static final hle c = new hle(l, "map=true");
   public static final hle d = new hle(l, "map=false");

   private static Function<alg, eaa<dma, dzz>> a() {
      Map<alg, eaa<dma, dzz>> $$0 = new HashMap<>(m);

      for (dma $$1 : mf.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public static CompletableFuture<hkr.c> a(hlk $$0, avd $$1, Executor $$2) {
      Function<alg, eaa<dma, dzz>> $$3 = a();
      return CompletableFuture.<Map<alg, List<avb>>>supplyAsync(() -> f.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hkr.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<alg, List<avb>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               alg $$3xx = f.b($$5.getKey());
               eaa<dma, dzz> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  e.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<avb> $$5x = $$5.getValue();
                  List<hkr.a> $$6 = new ArrayList<>($$5x.size());

                  for (avb $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = azc.a($$8);
                        grf $$10 = grf.a($$9);
                        $$6.add(new hkr.a($$7.b(), $$10));
                     } catch (Exception var15) {
                        e.error("Failed to load blockstate definition {} from pack {}", new Object[]{$$3xx, $$7.b(), var15});
                     }
                  }

                  try {
                     return a($$3xx, $$4x, $$6, $$0);
                  } catch (Exception var12) {
                     e.error("Failed to load blockstate definition {}", $$3xx, var12);
                     return null;
                  }
               }
            }, $$2));
         }

         return af.d($$4).thenApply($$0xx -> {
            Map<hle, hkr.b> $$1xx = new HashMap<>();

            for (hkr.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.c());
               }
            }

            return new hkr.c($$1xx);
         });
      });
   }

   private static hkr.c a(alg $$0, eaa<dma, dzz> $$1, List<hkr.a> $$2, hlk $$3) {
      Map<hle, hkr.b> $$4 = new HashMap<>();

      for (hkr.a $$5 : $$2) {
         $$5.b.a($$1, $$0 + "/" + $$5.a).forEach(($$2x, $$3x) -> {
            hle $$4x = gqv.a($$0, $$2x);
            $$4.put($$4x, new hkr.b($$2x, $$3x));
         });
      }

      return new hkr.c($$4);
   }

   static record a(String a, grf b) {
   }

   public static record b(dzz a, grm b) {
   }

   public static record c(Map<hle, hkr.b> a) {
      public Stream<hlh> a() {
         return this.a.values().stream().map(hkr.b::b);
      }

      public Map<hle, grm> b() {
         return af.a(this.a, hkr.b::b);
      }

      public Map<hle, hkr.b> c() {
         return this.a;
      }
   }
}
