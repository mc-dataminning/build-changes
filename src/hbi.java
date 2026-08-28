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

public class hbi implements auy, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final ale b = ale.a("blockstates");
   private static final ale c = ale.a("models");
   private static final Map<all, all> d = Map.of(
      gjs.c,
      all.b("banner_patterns"),
      gjs.b,
      all.b("beds"),
      gjs.f,
      all.b("chests"),
      gjs.d,
      all.b("shield_patterns"),
      gjs.e,
      all.b("signs"),
      gjs.a,
      all.b("shulker_boxes"),
      gjs.g,
      all.b("armor_trims"),
      gjs.h,
      all.b("decorated_pot"),
      gys.d,
      all.b("blocks")
   );
   private Map<hbj, hav> e;
   private final hau f;
   private final gjz g;
   private final fkz h;
   private int i;
   private hav j;
   private Object2IntMap<dvo> k;

   public hbi(gyu $$0, fkz $$1, int $$2) {
      this.h = $$1;
      this.i = $$2;
      this.g = new gjz(this);
      this.f = new hau(d, $$0);
   }

   public hav a(hbj $$0) {
      return this.e.getOrDefault($$0, this.j);
   }

   public hav a() {
      return this.j;
   }

   public gjz b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(auy.a $$0, ave $$1, Executor $$2, Executor $$3) {
      hbo $$4 = hbd.a();
      hax $$5 = new hax($$4);
      CompletableFuture<Map<all, hbo>> $$6 = a($$1, $$2);
      CompletableFuture<hax.c> $$7 = a($$5, $$1, $$2);
      CompletableFuture<hbg> $$8 = $$7.thenCombineAsync($$6, ($$1x, $$2x) -> this.a($$4, $$2x, $$1x), $$2);
      CompletableFuture<Object2IntMap<dvo>> $$9 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<all, CompletableFuture<hau.b>> $$10 = this.f.a($$1, this.i, $$2);
      return CompletableFuture.allOf(Stream.concat($$10.values().stream(), Stream.of($$8, $$9)).toArray(CompletableFuture[]::new)).thenApplyAsync($$4x -> {
         Map<all, hau.b> $$5x = $$10.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (hau.b)((CompletableFuture)$$0xx.getValue()).join()));
         hbg $$6x = $$8.join();
         Object2IntMap<dvo> $$7x = $$9.join();
         return this.a(boq.a(), $$5x, new hbf($$6x.b(), $$6x.c(), $$4), $$7x);
      }, $$2).thenCompose($$0x -> $$0x.f.thenApply($$1x -> $$0x)).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, boq.a()), $$3);
   }

   private static CompletableFuture<Map<all, hbo>> a(ave $$0, Executor $$1) {
      return CompletableFuture.<Map<all, avc>>supplyAsync(() -> c.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<all, gkj>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<all, avc> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               all $$1xx = c.b($$3.getKey());

               try {
                  Pair var4x;
                  try (Reader $$2x = $$3.getValue().e()) {
                     gkj $$3x = gkj.a($$2x);
                     $$3x.c = $$1xx.toString();
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

   private hbg a(hbo $$0, Map<all, hbo> $$1, hax.c $$2) {
      hbg $$3 = new hbg($$1, $$0);
      $$3.a($$2);
      $$3.a();
      return $$3;
   }

   private static CompletableFuture<hax.c> a(hax $$0, ave $$1, Executor $$2) {
      Function<all, dvp<dij, dvo>> $$3 = hax.a();
      return CompletableFuture.<Map<all, List<avc>>>supplyAsync(() -> b.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hax.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<all, List<avc>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               all $$3xx = b.b($$5.getKey());
               dvp<dij, dvo> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<avc> $$5x = $$5.getValue();
                  List<hax.a> $$6 = new ArrayList<>($$5x.size());

                  for (avc $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = azd.a($$8);
                        gkk $$10 = gkk.a($$9);
                        $$6.add(new hax.a($$7.b(), $$10));
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
            Map<hbj, hax.b> $$1xx = new HashMap<>();

            for (hax.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new hax.c($$1xx);
         });
      });
   }

   private hbi.a a(bor $$0, Map<all, hau.b> $$1, hbf $$2, Object2IntMap<dvo> $$3) {
      $$0.a("baking");
      Multimap<hbj, hbc> $$4 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         hau.b $$4x = $$1.get($$3x.a());
         gyt $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(hbc.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<hbj, hav> $$5 = $$2.a();
      hav $$6 = $$5.get(hbd.c);
      Map<dvo, hav> $$7 = new IdentityHashMap<>();

      for (dij $$8 : lz.e) {
         $$8.l().a().forEach($$3x -> {
            all $$4x = $$3x.b().p().h().a();
            hav $$5x = $$5.getOrDefault(gjz.a($$4x, $$3x), $$6);
            $$7.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$9 = CompletableFuture.allOf($$1.values().stream().map(hau.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hbi.a($$2, $$3, $$6, $$7, $$1, $$9);
   }

   private static Object2IntMap<dvo> a(fkz $$0, hax.c $$1) {
      return hbh.a($$0, $$1);
   }

   private void a(hbi.a $$0, bor $$1) {
      $$1.a("upload");
      $$0.e.values().forEach(hau.b::c);
      hbf $$2 = $$0.a;
      this.e = $$2.a();
      this.k = $$0.b;
      this.j = $$0.c;
      $$1.b("cache");
      this.g.a($$0.d);
      $$1.c();
   }

   public boolean a(dvo $$0, dvo $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.k.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.k.getInt($$1);
            if ($$2 == $$3) {
               ero $$4 = $$0.y();
               ero $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gys a(all $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   static record a(hbf a, Object2IntMap<dvo> b, hav c, Map<dvo, hav> d, Map<all, hau.b> e, CompletableFuture<Void> f) {
   }
}
