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

public class hiu {
   private static final Logger e = LogUtils.getLogger();
   private static final akw f = akw.a("blockstates");
   private static final String g = "map";
   private static final String h = "map=true";
   private static final String i = "map=false";
   private static final dyn<dku, dym> j = new dyn.a<dku, dym>(dkw.a).a(dzd.a("map")).a(dku::m, dym::new);
   private static final ald k = ald.b("glow_item_frame");
   private static final ald l = ald.b("item_frame");
   private static final Map<ald, dyn<dku, dym>> m = Map.of(l, j, k, j);
   public static final hjh a = new hjh(k, "map=true");
   public static final hjh b = new hjh(k, "map=false");
   public static final hjh c = new hjh(l, "map=true");
   public static final hjh d = new hjh(l, "map=false");

   private static Function<ald, dyn<dku, dym>> a() {
      Map<ald, dyn<dku, dym>> $$0 = new HashMap<>(m);

      for (dku $$1 : md.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public static CompletableFuture<hiu.c> a(hjn $$0, ava $$1, Executor $$2) {
      Function<ald, dyn<dku, dym>> $$3 = a();
      return CompletableFuture.<Map<ald, List<auy>>>supplyAsync(() -> f.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hiu.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<ald, List<auy>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               ald $$3xx = f.b($$5.getKey());
               dyn<dku, dym> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  e.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<auy> $$5x = $$5.getValue();
                  List<hiu.a> $$6 = new ArrayList<>($$5x.size());

                  for (auy $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = aza.a($$8);
                        gpl $$10 = gpl.a($$9);
                        $$6.add(new hiu.a($$7.b(), $$10));
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
            Map<hjh, hiu.b> $$1xx = new HashMap<>();

            for (hiu.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.c());
               }
            }

            return new hiu.c($$1xx);
         });
      });
   }

   private static hiu.c a(ald $$0, dyn<dku, dym> $$1, List<hiu.a> $$2, hjn $$3) {
      Map<hjh, hiu.b> $$4 = new HashMap<>();

      for (hiu.a $$5 : $$2) {
         $$5.b.a($$1, $$0 + "/" + $$5.a).forEach(($$2x, $$3x) -> {
            hjh $$4x = gpb.a($$0, $$2x);
            $$4.put($$4x, new hiu.b($$2x, $$3x));
         });
      }

      return new hiu.c($$4);
   }

   static record a(String a, gpl b) {
   }

   public static record b(dym a, gps b) {
   }

   public static record c(Map<hjh, hiu.b> a) {
      public Stream<hjk> a() {
         return this.a.values().stream().map(hiu.b::b);
      }

      public Map<hjh, gps> b() {
         return af.a(this.a, hiu.b::b);
      }

      public Map<hjh, hiu.b> c() {
         return this.a;
      }
   }
}
