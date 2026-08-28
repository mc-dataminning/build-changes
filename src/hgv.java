import com.google.common.collect.Maps;
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

public class hgv {
   private static final Logger e = LogUtils.getLogger();
   private static final ako f = ako.a("blockstates");
   private static final String g = "map";
   private static final String h = "map=true";
   private static final String i = "map=false";
   private static final dwz<djn, dwy> j = new dwz.a<djn, dwy>(djp.a).a(dxp.a("map")).a(djn::m, dwy::new);
   private static final akv k = akv.b("glow_item_frame");
   private static final akv l = akv.b("item_frame");
   private static final Map<akv, dwz<djn, dwy>> m = Map.of(l, j, k, j);
   public static final hhi a = new hhi(k, "map=true");
   public static final hhi b = new hhi(k, "map=false");
   public static final hhi c = new hhi(l, "map=true");
   public static final hhi d = new hhi(l, "map=false");

   private static Function<akv, dwz<djn, dwy>> a() {
      Map<akv, dwz<djn, dwy>> $$0 = new HashMap<>(m);

      for (djn $$1 : mb.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public static CompletableFuture<hgv.c> a(hho $$0, aup $$1, Executor $$2) {
      Function<akv, dwz<djn, dwy>> $$3 = a();
      return CompletableFuture.<Map<akv, List<aun>>>supplyAsync(() -> f.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hgv.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<akv, List<aun>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               akv $$3xx = f.b($$5.getKey());
               dwz<djn, dwy> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  e.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<aun> $$5x = $$5.getValue();
                  List<hgv.a> $$6 = new ArrayList<>($$5x.size());

                  for (aun $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = ayp.a($$8);
                        gnm $$10 = gnm.a($$9);
                        $$6.add(new hgv.a($$7.b(), $$10));
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
            Map<hhi, hgv.b> $$1xx = new HashMap<>();

            for (hgv.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.c());
               }
            }

            return new hgv.c($$1xx);
         });
      });
   }

   private static hgv.c a(akv $$0, dwz<djn, dwy> $$1, List<hgv.a> $$2, hho $$3) {
      Map<hhi, hgv.b> $$4 = new HashMap<>();

      for (hgv.a $$5 : $$2) {
         $$5.b.a($$1, $$0 + "/" + $$5.a).forEach(($$2x, $$3x) -> {
            hhi $$4x = gnc.a($$0, $$2x);
            $$4.put($$4x, new hgv.b($$2x, $$3x));
         });
      }

      return new hgv.c($$4);
   }

   static record a(String a, gnm b) {
   }

   public static record b(dwy a, gnt b) {
   }

   public static record c(Map<hhi, hgv.b> a) {
      public Stream<hhl> a() {
         return this.a.values().stream().map(hgv.b::b);
      }

      public Map<hhi, gnt> b() {
         return Maps.transformValues(this.a, hgv.b::b);
      }

      public Map<hhi, hgv.b> c() {
         return this.a;
      }
   }
}
