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

public class hht {
   private static final Logger e = LogUtils.getLogger();
   private static final akn f = akn.a("blockstates");
   private static final String g = "map";
   private static final String h = "map=true";
   private static final String i = "map=false";
   private static final dxr<dke, dxq> j = new dxr.a<dke, dxq>(dkg.a).a(dyh.a("map")).a(dke::m, dxq::new);
   private static final aku k = aku.b("glow_item_frame");
   private static final aku l = aku.b("item_frame");
   private static final Map<aku, dxr<dke, dxq>> m = Map.of(l, j, k, j);
   public static final hig a = new hig(k, "map=true");
   public static final hig b = new hig(k, "map=false");
   public static final hig c = new hig(l, "map=true");
   public static final hig d = new hig(l, "map=false");

   private static Function<aku, dxr<dke, dxq>> a() {
      Map<aku, dxr<dke, dxq>> $$0 = new HashMap<>(m);

      for (dke $$1 : mb.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public static CompletableFuture<hht.c> a(him $$0, aup $$1, Executor $$2) {
      Function<aku, dxr<dke, dxq>> $$3 = a();
      return CompletableFuture.<Map<aku, List<aun>>>supplyAsync(() -> f.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hht.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<aku, List<aun>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               aku $$3xx = f.b($$5.getKey());
               dxr<dke, dxq> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  e.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<aun> $$5x = $$5.getValue();
                  List<hht.a> $$6 = new ArrayList<>($$5x.size());

                  for (aun $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = ayp.a($$8);
                        gok $$10 = gok.a($$9);
                        $$6.add(new hht.a($$7.b(), $$10));
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
            Map<hig, hht.b> $$1xx = new HashMap<>();

            for (hht.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.c());
               }
            }

            return new hht.c($$1xx);
         });
      });
   }

   private static hht.c a(aku $$0, dxr<dke, dxq> $$1, List<hht.a> $$2, him $$3) {
      Map<hig, hht.b> $$4 = new HashMap<>();

      for (hht.a $$5 : $$2) {
         $$5.b.a($$1, $$0 + "/" + $$5.a).forEach(($$2x, $$3x) -> {
            hig $$4x = goa.a($$0, $$2x);
            $$4.put($$4x, new hht.b($$2x, $$3x));
         });
      }

      return new hht.c($$4);
   }

   static record a(String a, gok b) {
   }

   public static record b(dxq a, gor b) {
   }

   public static record c(Map<hig, hht.b> a) {
      public Stream<hij> a() {
         return this.a.values().stream().map(hht.b::b);
      }

      public Map<hig, gor> b() {
         return af.a(this.a, hht.b::b);
      }

      public Map<hig, hht.b> c() {
         return this.a;
      }
   }
}
