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

public class hkb {
   private static final Logger e = LogUtils.getLogger();
   private static final akx f = akx.a("blockstates");
   private static final String g = "map";
   private static final String h = "map=true";
   private static final String i = "map=false";
   private static final dzp<dlu, dzo> j = new dzp.a<dlu, dzo>(dlw.a).a(eaf.a("map")).a(dlu::m, dzo::new);
   private static final ale k = ale.b("glow_item_frame");
   private static final ale l = ale.b("item_frame");
   private static final Map<ale, dzp<dlu, dzo>> m = Map.of(l, j, k, j);
   public static final hko a = new hko(k, "map=true");
   public static final hko b = new hko(k, "map=false");
   public static final hko c = new hko(l, "map=true");
   public static final hko d = new hko(l, "map=false");

   private static Function<ale, dzp<dlu, dzo>> a() {
      Map<ale, dzp<dlu, dzo>> $$0 = new HashMap<>(m);

      for (dlu $$1 : mf.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public static CompletableFuture<hkb.c> a(hku $$0, avb $$1, Executor $$2) {
      Function<ale, dzp<dlu, dzo>> $$3 = a();
      return CompletableFuture.<Map<ale, List<auz>>>supplyAsync(() -> f.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hkb.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<ale, List<auz>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               ale $$3xx = f.b($$5.getKey());
               dzp<dlu, dzo> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  e.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<auz> $$5x = $$5.getValue();
                  List<hkb.a> $$6 = new ArrayList<>($$5x.size());

                  for (auz $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = aza.a($$8);
                        gqq $$10 = gqq.a($$9);
                        $$6.add(new hkb.a($$7.b(), $$10));
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
            Map<hko, hkb.b> $$1xx = new HashMap<>();

            for (hkb.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.c());
               }
            }

            return new hkb.c($$1xx);
         });
      });
   }

   private static hkb.c a(ale $$0, dzp<dlu, dzo> $$1, List<hkb.a> $$2, hku $$3) {
      Map<hko, hkb.b> $$4 = new HashMap<>();

      for (hkb.a $$5 : $$2) {
         $$5.b.a($$1, $$0 + "/" + $$5.a).forEach(($$2x, $$3x) -> {
            hko $$4x = gqg.a($$0, $$2x);
            $$4.put($$4x, new hkb.b($$2x, $$3x));
         });
      }

      return new hkb.c($$4);
   }

   static record a(String a, gqq b) {
   }

   public static record b(dzo a, gqx b) {
   }

   public static record c(Map<hko, hkb.b> a) {
      public Stream<hkr> a() {
         return this.a.values().stream().map(hkb.b::b);
      }

      public Map<hko, gqx> b() {
         return af.a(this.a, hkb.b::b);
      }

      public Map<hko, hkb.b> c() {
         return this.a;
      }
   }
}
