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

public class hkz {
   private static final Logger e = LogUtils.getLogger();
   private static final akz f = akz.a("blockstates");
   private static final String g = "map";
   private static final String h = "map=true";
   private static final String i = "map=false";
   private static final eai<dmf, eah> j = new eai.a<dmf, eah>(dmh.a).a(eay.a("map")).a(dmf::m, eah::new);
   private static final alg k = alg.b("glow_item_frame");
   private static final alg l = alg.b("item_frame");
   private static final Map<alg, eai<dmf, eah>> m = Map.of(l, j, k, j);
   public static final hlm a = new hlm(k, "map=true");
   public static final hlm b = new hlm(k, "map=false");
   public static final hlm c = new hlm(l, "map=true");
   public static final hlm d = new hlm(l, "map=false");

   private static Function<alg, eai<dmf, eah>> a() {
      Map<alg, eai<dmf, eah>> $$0 = new HashMap<>(m);

      for (dmf $$1 : mf.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public static CompletableFuture<hkz.c> a(hls $$0, avd $$1, Executor $$2) {
      Function<alg, eai<dmf, eah>> $$3 = a();
      return CompletableFuture.<Map<alg, List<avb>>>supplyAsync(() -> f.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hkz.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<alg, List<avb>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               alg $$3xx = f.b($$5.getKey());
               eai<dmf, eah> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  e.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<avb> $$5x = $$5.getValue();
                  List<hkz.a> $$6 = new ArrayList<>($$5x.size());

                  for (avb $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = azc.a($$8);
                        grn $$10 = grn.a($$9);
                        $$6.add(new hkz.a($$7.b(), $$10));
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
            Map<hlm, hkz.b> $$1xx = new HashMap<>();

            for (hkz.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.c());
               }
            }

            return new hkz.c($$1xx);
         });
      });
   }

   private static hkz.c a(alg $$0, eai<dmf, eah> $$1, List<hkz.a> $$2, hls $$3) {
      Map<hlm, hkz.b> $$4 = new HashMap<>();

      for (hkz.a $$5 : $$2) {
         $$5.b.a($$1, $$0 + "/" + $$5.a).forEach(($$2x, $$3x) -> {
            hlm $$4x = grd.a($$0, $$2x);
            $$4.put($$4x, new hkz.b($$2x, $$3x));
         });
      }

      return new hkz.c($$4);
   }

   static record a(String a, grn b) {
   }

   public static record b(eah a, gru b) {
   }

   public static record c(Map<hlm, hkz.b> a) {
      public Stream<hlp> a() {
         return this.a.values().stream().map(hkz.b::b);
      }

      public Map<hlm, gru> b() {
         return af.a(this.a, hkz.b::b);
      }

      public Map<hlm, hkz.b> c() {
         return this.a;
      }
   }
}
