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

public class gyw implements aum, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final aku b = aku.a("blockstates");
   private static final aku c = aku.a("models");
   private static final Map<alb, alb> d = Map.of(
      ghm.c,
      alb.b("banner_patterns"),
      ghm.b,
      alb.b("beds"),
      ghm.f,
      alb.b("chests"),
      ghm.d,
      alb.b("shield_patterns"),
      ghm.e,
      alb.b("signs"),
      ghm.a,
      alb.b("shulker_boxes"),
      ghm.g,
      alb.b("armor_trims"),
      ghm.h,
      alb.b("decorated_pot"),
      gwj.d,
      alb.b("blocks")
   );
   private Map<gyx, gym> e;
   private final gyl f;
   private final ght g;
   private final fjd h;
   private int i;
   private gym j;
   private Object2IntMap<dua> k;

   public gyw(gwl $$0, fjd $$1, int $$2) {
      this.h = $$1;
      this.i = $$2;
      this.g = new ght(this);
      this.f = new gyl(d, $$0);
   }

   public gym a(gyx $$0) {
      return this.e.getOrDefault($$0, this.j);
   }

   public gym a() {
      return this.j;
   }

   public ght b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(aum.a $$0, aus $$1, bny $$2, bny $$3, Executor $$4, Executor $$5) {
      $$2.a();
      gzc $$6 = gyr.a();
      gyo $$7 = new gyo($$6);
      CompletableFuture<Map<alb, gzc>> $$8 = a($$1, $$4);
      CompletableFuture<gyo.c> $$9 = a($$7, $$1, $$4);
      CompletableFuture<gyu> $$10 = $$9.thenCombineAsync($$8, ($$1x, $$2x) -> this.a($$6, $$2x, $$1x), $$4);
      CompletableFuture<Object2IntMap<dua>> $$11 = $$9.thenApplyAsync($$0x -> a(this.h, $$0x), $$4);
      Map<alb, CompletableFuture<gyl.b>> $$12 = this.f.a($$1, this.i, $$4);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11)).toArray(CompletableFuture[]::new)).thenApplyAsync($$5x -> {
         Map<alb, gyl.b> $$6x = $$12.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gyl.b)((CompletableFuture)$$0xx.getValue()).join()));
         gyu $$7x = $$10.join();
         Object2IntMap<dua> $$8x = $$11.join();
         return this.a($$2, $$6x, new gyt($$7x.b(), $$7x.c(), $$6), $$8x);
      }, $$4).thenCompose($$0x -> $$0x.f.thenApply($$1x -> $$0x)).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<alb, gzc>> a(aus $$0, Executor $$1) {
      return CompletableFuture.<Map<alb, auq>>supplyAsync(() -> c.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alb, gic>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alb, auq> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alb $$1xx = c.b($$3.getKey());

               try {
                  Pair var4x;
                  try (Reader $$2x = $$3.getValue().e()) {
                     gic $$3x = gic.a($$2x);
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

   private gyu a(gzc $$0, Map<alb, gzc> $$1, gyo.c $$2) {
      gyu $$3 = new gyu($$1, $$0);
      $$3.a($$2);
      $$3.a();
      return $$3;
   }

   private static CompletableFuture<gyo.c> a(gyo $$0, aus $$1, Executor $$2) {
      Function<alb, dub<dgv, dua>> $$3 = gyo.a();
      return CompletableFuture.<Map<alb, List<auq>>>supplyAsync(() -> b.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<gyo.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<alb, List<auq>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               alb $$3xx = b.b($$5.getKey());
               dub<dgv, dua> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<auq> $$5x = $$5.getValue();
                  List<gyo.a> $$6 = new ArrayList<>($$5x.size());

                  for (auq $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = ays.a($$8);
                        gid $$10 = gid.a($$9);
                        $$6.add(new gyo.a($$7.b(), $$10));
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
            Map<gyx, gyo.b> $$1xx = new HashMap<>();

            for (gyo.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new gyo.c($$1xx);
         });
      });
   }

   private gyw.a a(bny $$0, Map<alb, gyl.b> $$1, gyt $$2, Object2IntMap<dua> $$3) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<gyx, gyq> $$4 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gyl.b $$4x = $$1.get($$3x.a());
         gwk $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gyq.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<gyx, gym> $$5 = $$2.a();
      gym $$6 = $$5.get(gyr.c);
      Map<dua, gym> $$7 = new IdentityHashMap<>();

      for (dgv $$8 : lu.e) {
         $$8.l().a().forEach($$3x -> {
            alb $$4x = $$3x.b().s().h().a();
            gym $$5x = $$5.getOrDefault(ght.a($$4x, $$3x), $$6);
            $$7.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$9 = CompletableFuture.allOf($$1.values().stream().map(gyl.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gyw.a($$2, $$3, $$6, $$7, $$1, $$9);
   }

   private static Object2IntMap<dua> a(fjd $$0, gyo.c $$1) {
      return gyv.a($$0, $$1);
   }

   private void a(gyw.a $$0, bny $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.e.values().forEach(gyl.b::c);
      gyt $$2 = $$0.a;
      this.e = $$2.a();
      this.k = $$0.b;
      this.j = $$0.c;
      $$1.b("cache");
      this.g.a($$0.d);
      $$1.c();
      $$1.b();
   }

   public boolean a(dua $$0, dua $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.k.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.k.getInt($$1);
            if ($$2 == $$3) {
               eqb $$4 = $$0.y();
               eqb $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gwj a(alb $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   static record a(gyt a, Object2IntMap<dua> b, gym c, Map<dua, gym> d, Map<alb, gyl.b> e, CompletableFuture<Void> f) {
   }
}
