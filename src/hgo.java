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

public class hgo {
   private static final Logger e = LogUtils.getLogger();
   private static final akn f = akn.a("blockstates");
   private static final String g = "map";
   private static final String h = "map=true";
   private static final String i = "map=false";
   private static final dww<djk, dwv> j = new dww.a<djk, dwv>(djm.a).a(dxm.a("map")).a(djk::m, dwv::new);
   private static final aku k = aku.b("glow_item_frame");
   private static final aku l = aku.b("item_frame");
   private static final Map<aku, dww<djk, dwv>> m = Map.of(l, j, k, j);
   public static final hhb a = new hhb(k, "map=true");
   public static final hhb b = new hhb(k, "map=false");
   public static final hhb c = new hhb(l, "map=true");
   public static final hhb d = new hhb(l, "map=false");

   private static Function<aku, dww<djk, dwv>> a() {
      Map<aku, dww<djk, dwv>> $$0 = new HashMap<>(m);

      for (djk $$1 : mb.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public static CompletableFuture<hgo.c> a(hhh $$0, auo $$1, Executor $$2) {
      Function<aku, dww<djk, dwv>> $$3 = a();
      return CompletableFuture.<Map<aku, List<aum>>>supplyAsync(() -> f.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hgo.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<aku, List<aum>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               aku $$3xx = f.b($$5.getKey());
               dww<djk, dwv> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  e.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<aum> $$5x = $$5.getValue();
                  List<hgo.a> $$6 = new ArrayList<>($$5x.size());

                  for (aum $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = ayo.a($$8);
                        gni $$10 = gni.a($$9);
                        $$6.add(new hgo.a($$7.b(), $$10));
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
            Map<hhb, hgo.b> $$1xx = new HashMap<>();

            for (hgo.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.c());
               }
            }

            return new hgo.c($$1xx);
         });
      });
   }

   private static hgo.c a(aku $$0, dww<djk, dwv> $$1, List<hgo.a> $$2, hhh $$3) {
      Map<hhb, hgo.b> $$4 = new HashMap<>();

      for (hgo.a $$5 : $$2) {
         $$5.b.a($$1, $$0 + "/" + $$5.a).forEach(($$2x, $$3x) -> {
            hhb $$4x = gmy.a($$0, $$2x);
            $$4.put($$4x, new hgo.b($$2x, $$3x));
         });
      }

      return new hgo.c($$4);
   }

   static record a(String a, gni b) {
   }

   public static record b(dwv a, gnp b) {
   }

   public static record c(Map<hhb, hgo.b> a) {
      public Stream<hhe> a() {
         return this.a.values().stream().map(hgo.b::b);
      }

      public Map<hhb, gnp> b() {
         return Maps.transformValues(this.a, hgo.b::b);
      }

      public Map<hhb, hgo.b> c() {
         return this.a;
      }
   }
}
