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

public class hgn {
   private static final Logger e = LogUtils.getLogger();
   private static final akn f = akn.a("blockstates");
   private static final String g = "map";
   private static final String h = "map=true";
   private static final String i = "map=false";
   private static final dwy<djm, dwx> j = new dwy.a<djm, dwx>(djo.a).a(dxo.a("map")).a(djm::m, dwx::new);
   private static final aku k = aku.b("glow_item_frame");
   private static final aku l = aku.b("item_frame");
   private static final Map<aku, dwy<djm, dwx>> m = Map.of(l, j, k, j);
   public static final hha a = new hha(k, "map=true");
   public static final hha b = new hha(k, "map=false");
   public static final hha c = new hha(l, "map=true");
   public static final hha d = new hha(l, "map=false");

   private static Function<aku, dwy<djm, dwx>> a() {
      Map<aku, dwy<djm, dwx>> $$0 = new HashMap<>(m);

      for (djm $$1 : mb.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public static CompletableFuture<hgn.c> a(hhg $$0, aup $$1, Executor $$2) {
      Function<aku, dwy<djm, dwx>> $$3 = a();
      return CompletableFuture.<Map<aku, List<aun>>>supplyAsync(() -> f.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hgn.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<aku, List<aun>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               aku $$3xx = f.b($$5.getKey());
               dwy<djm, dwx> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  e.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<aun> $$5x = $$5.getValue();
                  List<hgn.a> $$6 = new ArrayList<>($$5x.size());

                  for (aun $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = ayp.a($$8);
                        gnk $$10 = gnk.a($$9);
                        $$6.add(new hgn.a($$7.b(), $$10));
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
            Map<hha, hgn.b> $$1xx = new HashMap<>();

            for (hgn.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.c());
               }
            }

            return new hgn.c($$1xx);
         });
      });
   }

   private static hgn.c a(aku $$0, dwy<djm, dwx> $$1, List<hgn.a> $$2, hhg $$3) {
      Map<hha, hgn.b> $$4 = new HashMap<>();

      for (hgn.a $$5 : $$2) {
         $$5.b.a($$1, $$0 + "/" + $$5.a).forEach(($$2x, $$3x) -> {
            hha $$4x = gna.a($$0, $$2x);
            $$4.put($$4x, new hgn.b($$2x, $$3x));
         });
      }

      return new hgn.c($$4);
   }

   static record a(String a, gnk b) {
   }

   public static record b(dwx a, gnr b) {
   }

   public static record c(Map<hha, hgn.b> a) {
      public Stream<hhd> a() {
         return this.a.values().stream().map(hgn.b::b);
      }

      public Map<hha, gnr> b() {
         return Maps.transformValues(this.a, hgn.b::b);
      }

      public Map<hha, hgn.b> c() {
         return this.a;
      }
   }
}
