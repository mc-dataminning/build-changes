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

public class gzs implements aup, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final akx b = akx.a("blockstates");
   private static final akx c = akx.a("models");
   private static final Map<ale, ale> d = Map.of(
      gig.c,
      ale.b("banner_patterns"),
      gig.b,
      ale.b("beds"),
      gig.f,
      ale.b("chests"),
      gig.d,
      ale.b("shield_patterns"),
      gig.e,
      ale.b("signs"),
      gig.a,
      ale.b("shulker_boxes"),
      gig.g,
      ale.b("armor_trims"),
      gig.h,
      ale.b("decorated_pot"),
      gxf.d,
      ale.b("blocks")
   );
   private Map<gzt, gzi> e;
   private final gzh f;
   private final gin g;
   private final fjr h;
   private int i;
   private gzi j;
   private Object2IntMap<dus> k;

   public gzs(gxh $$0, fjr $$1, int $$2) {
      this.h = $$1;
      this.i = $$2;
      this.g = new gin(this);
      this.f = new gzh(d, $$0);
   }

   public gzi a(gzt $$0) {
      return this.e.getOrDefault($$0, this.j);
   }

   public gzi a() {
      return this.j;
   }

   public gin b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(aup.a $$0, auv $$1, bog $$2, bog $$3, Executor $$4, Executor $$5) {
      $$2.a();
      gzy $$6 = gzn.a();
      gzk $$7 = new gzk($$6);
      CompletableFuture<Map<ale, gzy>> $$8 = a($$1, $$4);
      CompletableFuture<gzk.c> $$9 = a($$7, $$1, $$4);
      CompletableFuture<gzq> $$10 = $$9.thenCombineAsync($$8, ($$1x, $$2x) -> this.a($$6, $$2x, $$1x), $$4);
      CompletableFuture<Object2IntMap<dus>> $$11 = $$9.thenApplyAsync($$0x -> a(this.h, $$0x), $$4);
      Map<ale, CompletableFuture<gzh.b>> $$12 = this.f.a($$1, this.i, $$4);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11)).toArray(CompletableFuture[]::new)).thenApplyAsync($$5x -> {
         Map<ale, gzh.b> $$6x = $$12.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gzh.b)((CompletableFuture)$$0xx.getValue()).join()));
         gzq $$7x = $$10.join();
         Object2IntMap<dus> $$8x = $$11.join();
         return this.a($$2, $$6x, new gzp($$7x.b(), $$7x.c(), $$6), $$8x);
      }, $$4).thenCompose($$0x -> $$0x.f.thenApply($$1x -> $$0x)).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<ale, gzy>> a(auv $$0, Executor $$1) {
      return CompletableFuture.<Map<ale, aut>>supplyAsync(() -> c.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ale, giw>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ale, aut> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               ale $$1xx = c.b($$3.getKey());

               try {
                  Pair var4x;
                  try (Reader $$2x = $$3.getValue().e()) {
                     giw $$3x = giw.a($$2x);
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

   private gzq a(gzy $$0, Map<ale, gzy> $$1, gzk.c $$2) {
      gzq $$3 = new gzq($$1, $$0);
      $$3.a($$2);
      $$3.a();
      return $$3;
   }

   private static CompletableFuture<gzk.c> a(gzk $$0, auv $$1, Executor $$2) {
      Function<ale, dut<dhm, dus>> $$3 = gzk.a();
      return CompletableFuture.<Map<ale, List<aut>>>supplyAsync(() -> b.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<gzk.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<ale, List<aut>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               ale $$3xx = b.b($$5.getKey());
               dut<dhm, dus> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<aut> $$5x = $$5.getValue();
                  List<gzk.a> $$6 = new ArrayList<>($$5x.size());

                  for (aut $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = ayv.a($$8);
                        gix $$10 = gix.a($$9);
                        $$6.add(new gzk.a($$7.b(), $$10));
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
            Map<gzt, gzk.b> $$1xx = new HashMap<>();

            for (gzk.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new gzk.c($$1xx);
         });
      });
   }

   private gzs.a a(bog $$0, Map<ale, gzh.b> $$1, gzp $$2, Object2IntMap<dus> $$3) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<gzt, gzm> $$4 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gzh.b $$4x = $$1.get($$3x.a());
         gxg $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gzm.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<gzt, gzi> $$5 = $$2.a();
      gzi $$6 = $$5.get(gzn.c);
      Map<dus, gzi> $$7 = new IdentityHashMap<>();

      for (dhm $$8 : lv.e) {
         $$8.k().a().forEach($$3x -> {
            ale $$4x = $$3x.b().r().h().a();
            gzi $$5x = $$5.getOrDefault(gin.a($$4x, $$3x), $$6);
            $$7.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$9 = CompletableFuture.allOf($$1.values().stream().map(gzh.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gzs.a($$2, $$3, $$6, $$7, $$1, $$9);
   }

   private static Object2IntMap<dus> a(fjr $$0, gzk.c $$1) {
      return gzr.a($$0, $$1);
   }

   private void a(gzs.a $$0, bog $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.e.values().forEach(gzh.b::c);
      gzp $$2 = $$0.a;
      this.e = $$2.a();
      this.k = $$0.b;
      this.j = $$0.c;
      $$1.b("cache");
      this.g.a($$0.d);
      $$1.c();
      $$1.b();
   }

   public boolean a(dus $$0, dus $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.k.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.k.getInt($$1);
            if ($$2 == $$3) {
               eqt $$4 = $$0.y();
               eqt $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gxf a(ale $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   static record a(gzp a, Object2IntMap<dus> b, gzi c, Map<dus, gzi> d, Map<ale, gzh.b> e, CompletableFuture<Void> f) {
   }
}
