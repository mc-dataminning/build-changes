import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class hdv implements avf, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final ali b = ali.a("blockstates");
   private static final ali c = ali.a("models");
   private static final Map<alp, alp> d = Map.of(
      gmb.c,
      alp.b("banner_patterns"),
      gmb.b,
      alp.b("beds"),
      gmb.f,
      alp.b("chests"),
      gmb.d,
      alp.b("shield_patterns"),
      gmb.e,
      alp.b("signs"),
      gmb.a,
      alp.b("shulker_boxes"),
      gmb.g,
      alp.b("armor_trims"),
      gmb.h,
      alp.b("decorated_pot"),
      hbf.d,
      alp.b("blocks")
   );
   private Map<hdw, hdi> e;
   private final hdh f;
   private final gmi g;
   private final fnb h;
   private int i;
   private hdi j;
   private Object2IntMap<dxo> k;

   public hdv(hbh $$0, fnb $$1, int $$2) {
      this.h = $$1;
      this.i = $$2;
      this.g = new gmi(this);
      this.f = new hdh(d, $$0);
   }

   public hdi a(hdw $$0) {
      return this.e.getOrDefault($$0, this.j);
   }

   public hdi a() {
      return this.j;
   }

   public gmi b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(avf.a $$0, avl $$1, Executor $$2, Executor $$3) {
      heb $$4 = hdq.a();
      hdk $$5 = new hdk($$4);
      CompletableFuture<Map<alp, heb>> $$6 = a($$1, $$2);
      CompletableFuture<hdk.c> $$7 = a($$5, $$1, $$2);
      CompletableFuture<hdt> $$8 = $$7.thenCombineAsync($$6, ($$1x, $$2x) -> this.a($$4, $$2x, $$1x), $$2);
      CompletableFuture<Object2IntMap<dxo>> $$9 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<alp, CompletableFuture<hdh.b>> $$10 = this.f.a($$1, this.i, $$2);
      return CompletableFuture.allOf(Stream.concat($$10.values().stream(), Stream.of($$8, $$9)).toArray(CompletableFuture[]::new)).thenApplyAsync($$4x -> {
         Map<alp, hdh.b> $$5x = $$10.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (hdh.b)((CompletableFuture)$$0xx.getValue()).join()));
         hdt $$6x = $$8.join();
         Object2IntMap<dxo> $$7x = $$9.join();
         return this.a(bpi.a(), $$5x, new hds($$6x.b(), $$6x.c(), $$4), $$7x);
      }, $$2).thenCompose($$0x -> $$0x.f.thenApply($$1x -> $$0x)).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bpi.a()), $$3);
   }

   private static CompletableFuture<Map<alp, heb>> a(avl $$0, Executor $$1) {
      return CompletableFuture.<Map<alp, avj>>supplyAsync(() -> c.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alp, gms>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alp, avj> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alp $$1xx = c.b($$3.getKey());

               try {
                  Pair var4x;
                  try (Reader $$2x = $$3.getValue().e()) {
                     gms $$3x = gms.a($$2x);
                     $$3x.d = $$1xx.toString();
                     var4x = Pair.of($$1xx, $$3x);
                  }

                  return var4x;
               } catch (Exception var7) {
                  a.error("Failed to load model {}", $$3.getKey(), var7);
                  return null;
               }
            }, $$1));
         }

         return ae.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private hdt a(heb $$0, Map<alp, heb> $$1, hdk.c $$2) {
      hdt $$3 = new hdt($$1, $$0);
      $$3.a($$2);
      $$3.a();
      return $$3;
   }

   private static CompletableFuture<hdk.c> a(hdk $$0, avl $$1, Executor $$2) {
      Function<alp, dxp<dkd, dxo>> $$3 = hdk.a();
      return CompletableFuture.<Map<alp, List<avj>>>supplyAsync(() -> b.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hdk.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<alp, List<avj>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               alp $$3xx = b.b($$5.getKey());
               dxp<dkd, dxo> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<avj> $$5x = $$5.getValue();
                  List<hdk.a> $$6 = new ArrayList<>($$5x.size());

                  for (avj $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = azk.a($$8);
                        gmt $$10 = gmt.a($$9);
                        $$6.add(new hdk.a($$7.b(), $$10));
                     } catch (Exception var15) {
                        a.error("Failed to load blockstate definition {} from pack {}", new Object[]{$$3xx, $$7.b(), var15});
                     }
                  }

                  try {
                     return $$0.a($$3xx, $$4x, $$6);
                  } catch (Exception var12) {
                     a.error("Failed to load blockstate definition {}", $$3xx, var12);
                     return null;
                  }
               }
            }, $$2));
         }

         return ae.d($$4).thenApply($$0xx -> {
            Map<hdw, hdk.b> $$1xx = new HashMap<>();

            for (hdk.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new hdk.c($$1xx);
         });
      });
   }

   private hdv.a a(bpj $$0, Map<alp, hdh.b> $$1, hds $$2, Object2IntMap<dxo> $$3) {
      $$0.a("baking");
      Multimap<hdw, hdp> $$4 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         hdh.b $$4x = $$1.get($$3x.a());
         hbg $$5x = $$4x.a($$3x.b());
         if ($$5x != null) {
            return $$5x;
         } else {
            $$4.put($$2x, $$3x);
            return $$4x.a();
         }
      });
      $$4.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(hdp.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<hdw, hdi> $$5 = $$2.a();
      hdi $$6 = $$5.get(hdq.c);
      Map<dxo, hdi> $$7 = new IdentityHashMap<>();

      for (dkd $$8 : ma.e) {
         $$8.l().a().forEach($$3x -> {
            alp $$4x = $$3x.b().p().h().a();
            hdi $$5x = $$5.getOrDefault(gmi.a($$4x, $$3x), $$6);
            $$7.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$9 = CompletableFuture.allOf($$1.values().stream().map(hdh.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hdv.a($$2, $$3, $$6, $$7, $$1, $$9);
   }

   private static Object2IntMap<dxo> a(fnb $$0, hdk.c $$1) {
      return hdu.a($$0, $$1);
   }

   private void a(hdv.a $$0, bpj $$1) {
      $$1.a("upload");
      $$0.e.values().forEach(hdh.b::c);
      hds $$2 = $$0.a;
      this.e = $$2.a();
      this.k = $$0.b;
      this.j = $$0.c;
      $$1.b("cache");
      this.g.a($$0.d);
      $$1.c();
   }

   public boolean a(dxo $$0, dxo $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.k.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.k.getInt($$1);
            if ($$2 == $$3) {
               etq $$4 = $$0.y();
               etq $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hbf a(alp $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   static record a(hds a, Object2IntMap<dxo> b, hdi c, Map<dxo, hdi> d, Map<alp, hdh.b> e, CompletableFuture<Void> f) {
   }
}
