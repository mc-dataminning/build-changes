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

public class hgu {
   private static final Logger e = LogUtils.getLogger();
   private static final ako f = ako.a("blockstates");
   private static final String g = "map";
   private static final String h = "map=true";
   private static final String i = "map=false";
   private static final dwy<djm, dwx> j = new dwy.a<djm, dwx>(djo.a).a(dxo.a("map")).a(djm::m, dwx::new);
   private static final akv k = akv.b("glow_item_frame");
   private static final akv l = akv.b("item_frame");
   private static final Map<akv, dwy<djm, dwx>> m = Map.of(l, j, k, j);
   public static final hhh a = new hhh(k, "map=true");
   public static final hhh b = new hhh(k, "map=false");
   public static final hhh c = new hhh(l, "map=true");
   public static final hhh d = new hhh(l, "map=false");

   private static Function<akv, dwy<djm, dwx>> a() {
      Map<akv, dwy<djm, dwx>> $$0 = new HashMap<>(m);

      for (djm $$1 : mb.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public static CompletableFuture<hgu.c> a(hhn $$0, aup $$1, Executor $$2) {
      Function<akv, dwy<djm, dwx>> $$3 = a();
      return CompletableFuture.<Map<akv, List<aun>>>supplyAsync(() -> f.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hgu.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<akv, List<aun>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               akv $$3xx = f.b($$5.getKey());
               dwy<djm, dwx> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  e.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<aun> $$5x = $$5.getValue();
                  List<hgu.a> $$6 = new ArrayList<>($$5x.size());

                  for (aun $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = ayp.a($$8);
                        gnl $$10 = gnl.a($$9);
                        $$6.add(new hgu.a($$7.b(), $$10));
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
            Map<hhh, hgu.b> $$1xx = new HashMap<>();

            for (hgu.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.c());
               }
            }

            return new hgu.c($$1xx);
         });
      });
   }

   private static hgu.c a(akv $$0, dwy<djm, dwx> $$1, List<hgu.a> $$2, hhn $$3) {
      Map<hhh, hgu.b> $$4 = new HashMap<>();

      for (hgu.a $$5 : $$2) {
         $$5.b.a($$1, $$0 + "/" + $$5.a).forEach(($$2x, $$3x) -> {
            hhh $$4x = gnb.a($$0, $$2x);
            $$4.put($$4x, new hgu.b($$2x, $$3x));
         });
      }

      return new hgu.c($$4);
   }

   static record a(String a, gnl b) {
   }

   public static record b(dwx a, gns b) {
   }

   public static record c(Map<hhh, hgu.b> a) {
      public Stream<hhk> a() {
         return this.a.values().stream().map(hgu.b::b);
      }

      public Map<hhh, gns> b() {
         return Maps.transformValues(this.a, hgu.b::b);
      }

      public Map<hhh, hgu.b> c() {
         return this.a;
      }
   }
}
