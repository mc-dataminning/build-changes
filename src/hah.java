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

public class hah implements aut, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final ala b = ala.a("blockstates");
   private static final ala c = ala.a("models");
   private static final Map<alh, alh> d = Map.of(
      gir.c,
      alh.b("banner_patterns"),
      gir.b,
      alh.b("beds"),
      gir.f,
      alh.b("chests"),
      gir.d,
      alh.b("shield_patterns"),
      gir.e,
      alh.b("signs"),
      gir.a,
      alh.b("shulker_boxes"),
      gir.g,
      alh.b("armor_trims"),
      gir.h,
      alh.b("decorated_pot"),
      gxr.d,
      alh.b("blocks")
   );
   private Map<hai, gzu> e;
   private final gzt f;
   private final giy g;
   private final fkc h;
   private int i;
   private gzu j;
   private Object2IntMap<dvd> k;

   public hah(gxt $$0, fkc $$1, int $$2) {
      this.h = $$1;
      this.i = $$2;
      this.g = new giy(this);
      this.f = new gzt(d, $$0);
   }

   public gzu a(hai $$0) {
      return this.e.getOrDefault($$0, this.j);
   }

   public gzu a() {
      return this.j;
   }

   public giy b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(aut.a $$0, ava $$1, bok $$2, bok $$3, Executor $$4, Executor $$5) {
      $$2.a();
      han $$6 = hac.a();
      gzw $$7 = new gzw($$6);
      CompletableFuture<Map<alh, han>> $$8 = a($$1, $$4);
      CompletableFuture<gzw.c> $$9 = a($$7, $$1, $$4);
      CompletableFuture<haf> $$10 = $$9.thenCombineAsync($$8, ($$1x, $$2x) -> this.a($$6, $$2x, $$1x), $$4);
      CompletableFuture<Object2IntMap<dvd>> $$11 = $$9.thenApplyAsync($$0x -> a(this.h, $$0x), $$4);
      Map<alh, CompletableFuture<gzt.b>> $$12 = this.f.a($$1, this.i, $$4);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11)).toArray(CompletableFuture[]::new)).thenApplyAsync($$5x -> {
         Map<alh, gzt.b> $$6x = $$12.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gzt.b)((CompletableFuture)$$0xx.getValue()).join()));
         haf $$7x = $$10.join();
         Object2IntMap<dvd> $$8x = $$11.join();
         return this.a($$2, $$6x, new hae($$7x.b(), $$7x.c(), $$6), $$8x);
      }, $$4).thenCompose($$0x -> $$0x.f.thenApply($$1x -> $$0x)).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<alh, han>> a(ava $$0, Executor $$1) {
      return CompletableFuture.<Map<alh, auy>>supplyAsync(() -> c.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alh, gji>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alh, auy> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alh $$1xx = c.b($$3.getKey());

               try {
                  Pair var4x;
                  try (Reader $$2x = $$3.getValue().e()) {
                     gji $$3x = gji.a($$2x);
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

         return ad.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private haf a(han $$0, Map<alh, han> $$1, gzw.c $$2) {
      haf $$3 = new haf($$1, $$0);
      $$3.a($$2);
      $$3.a();
      return $$3;
   }

   private static CompletableFuture<gzw.c> a(gzw $$0, ava $$1, Executor $$2) {
      Function<alh, dve<dhy, dvd>> $$3 = gzw.a();
      return CompletableFuture.<Map<alh, List<auy>>>supplyAsync(() -> b.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<gzw.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<alh, List<auy>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               alh $$3xx = b.b($$5.getKey());
               dve<dhy, dvd> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<auy> $$5x = $$5.getValue();
                  List<gzw.a> $$6 = new ArrayList<>($$5x.size());

                  for (auy $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = ayz.a($$8);
                        gjj $$10 = gjj.a($$9);
                        $$6.add(new gzw.a($$7.b(), $$10));
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

         return ad.d($$4).thenApply($$0xx -> {
            Map<hai, gzw.b> $$1xx = new HashMap<>();

            for (gzw.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new gzw.c($$1xx);
         });
      });
   }

   private hah.a a(bok $$0, Map<alh, gzt.b> $$1, hae $$2, Object2IntMap<dvd> $$3) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<hai, hab> $$4 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gzt.b $$4x = $$1.get($$3x.a());
         gxs $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(hab.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<hai, gzu> $$5 = $$2.a();
      gzu $$6 = $$5.get(hac.c);
      Map<dvd, gzu> $$7 = new IdentityHashMap<>();

      for (dhy $$8 : lx.e) {
         $$8.l().a().forEach($$3x -> {
            alh $$4x = $$3x.b().p().h().a();
            gzu $$5x = $$5.getOrDefault(giy.a($$4x, $$3x), $$6);
            $$7.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$9 = CompletableFuture.allOf($$1.values().stream().map(gzt.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new hah.a($$2, $$3, $$6, $$7, $$1, $$9);
   }

   private static Object2IntMap<dvd> a(fkc $$0, gzw.c $$1) {
      return hag.a($$0, $$1);
   }

   private void a(hah.a $$0, bok $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.e.values().forEach(gzt.b::c);
      hae $$2 = $$0.a;
      this.e = $$2.a();
      this.k = $$0.b;
      this.j = $$0.c;
      $$1.b("cache");
      this.g.a($$0.d);
      $$1.c();
      $$1.b();
   }

   public boolean a(dvd $$0, dvd $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.k.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.k.getInt($$1);
            if ($$2 == $$3) {
               ere $$4 = $$0.y();
               ere $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gxr a(alh $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   static record a(hae a, Object2IntMap<dvd> b, gzu c, Map<dvd, gzu> d, Map<alh, gzt.b> e, CompletableFuture<Void> f) {
   }
}
