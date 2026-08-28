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

public class hgt {
   private static final Logger e = LogUtils.getLogger();
   private static final ako f = ako.a("blockstates");
   private static final String g = "map";
   private static final String h = "map=true";
   private static final String i = "map=false";
   private static final dwx<djl, dww> j = new dwx.a<djl, dww>(djn.a).a(dxn.a("map")).a(djl::m, dww::new);
   private static final akv k = akv.b("glow_item_frame");
   private static final akv l = akv.b("item_frame");
   private static final Map<akv, dwx<djl, dww>> m = Map.of(l, j, k, j);
   public static final hhg a = new hhg(k, "map=true");
   public static final hhg b = new hhg(k, "map=false");
   public static final hhg c = new hhg(l, "map=true");
   public static final hhg d = new hhg(l, "map=false");

   private static Function<akv, dwx<djl, dww>> a() {
      Map<akv, dwx<djl, dww>> $$0 = new HashMap<>(m);

      for (djl $$1 : mb.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public static CompletableFuture<hgt.c> a(hhm $$0, aup $$1, Executor $$2) {
      Function<akv, dwx<djl, dww>> $$3 = a();
      return CompletableFuture.<Map<akv, List<aun>>>supplyAsync(() -> f.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hgt.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<akv, List<aun>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               akv $$3xx = f.b($$5.getKey());
               dwx<djl, dww> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  e.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<aun> $$5x = $$5.getValue();
                  List<hgt.a> $$6 = new ArrayList<>($$5x.size());

                  for (aun $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = ayp.a($$8);
                        gnk $$10 = gnk.a($$9);
                        $$6.add(new hgt.a($$7.b(), $$10));
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
            Map<hhg, hgt.b> $$1xx = new HashMap<>();

            for (hgt.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.c());
               }
            }

            return new hgt.c($$1xx);
         });
      });
   }

   private static hgt.c a(akv $$0, dwx<djl, dww> $$1, List<hgt.a> $$2, hhm $$3) {
      Map<hhg, hgt.b> $$4 = new HashMap<>();

      for (hgt.a $$5 : $$2) {
         $$5.b.a($$1, $$0 + "/" + $$5.a).forEach(($$2x, $$3x) -> {
            hhg $$4x = gna.a($$0, $$2x);
            $$4.put($$4x, new hgt.b($$2x, $$3x));
         });
      }

      return new hgt.c($$4);
   }

   static record a(String a, gnk b) {
   }

   public static record b(dww a, gnr b) {
   }

   public static record c(Map<hhg, hgt.b> a) {
      public Stream<hhj> a() {
         return this.a.values().stream().map(hgt.b::b);
      }

      public Map<hhg, gnr> b() {
         return Maps.transformValues(this.a, hgt.b::b);
      }

      public Map<hhg, hgt.b> c() {
         return this.a;
      }
   }
}
