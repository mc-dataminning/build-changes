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

public class gzn implements aun, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final akv b = akv.a("blockstates");
   private static final akv c = akv.a("models");
   private static final Map<alc, alc> d = Map.of(
      gib.c,
      alc.b("banner_patterns"),
      gib.b,
      alc.b("beds"),
      gib.f,
      alc.b("chests"),
      gib.d,
      alc.b("shield_patterns"),
      gib.e,
      alc.b("signs"),
      gib.a,
      alc.b("shulker_boxes"),
      gib.g,
      alc.b("armor_trims"),
      gib.h,
      alc.b("decorated_pot"),
      gxa.d,
      alc.b("blocks")
   );
   private Map<gzo, gzd> e;
   private final gzc f;
   private final gii g;
   private final fjn h;
   private int i;
   private gzd j;
   private Object2IntMap<duo> k;

   public gzn(gxc $$0, fjn $$1, int $$2) {
      this.h = $$1;
      this.i = $$2;
      this.g = new gii(this);
      this.f = new gzc(d, $$0);
   }

   public gzd a(gzo $$0) {
      return this.e.getOrDefault($$0, this.j);
   }

   public gzd a() {
      return this.j;
   }

   public gii b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(aun.a $$0, aut $$1, bod $$2, bod $$3, Executor $$4, Executor $$5) {
      $$2.a();
      gzt $$6 = gzi.a();
      gzf $$7 = new gzf($$6);
      CompletableFuture<Map<alc, gzt>> $$8 = a($$1, $$4);
      CompletableFuture<gzf.c> $$9 = a($$7, $$1, $$4);
      CompletableFuture<gzl> $$10 = $$9.thenCombineAsync($$8, ($$1x, $$2x) -> this.a($$6, $$2x, $$1x), $$4);
      CompletableFuture<Object2IntMap<duo>> $$11 = $$9.thenApplyAsync($$0x -> a(this.h, $$0x), $$4);
      Map<alc, CompletableFuture<gzc.b>> $$12 = this.f.a($$1, this.i, $$4);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11)).toArray(CompletableFuture[]::new)).thenApplyAsync($$5x -> {
         Map<alc, gzc.b> $$6x = $$12.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gzc.b)((CompletableFuture)$$0xx.getValue()).join()));
         gzl $$7x = $$10.join();
         Object2IntMap<duo> $$8x = $$11.join();
         return this.a($$2, $$6x, new gzk($$7x.b(), $$7x.c(), $$6), $$8x);
      }, $$4).thenCompose($$0x -> $$0x.f.thenApply($$1x -> $$0x)).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<alc, gzt>> a(aut $$0, Executor $$1) {
      return CompletableFuture.<Map<alc, aur>>supplyAsync(() -> c.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alc, gir>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alc, aur> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alc $$1xx = c.b($$3.getKey());

               try {
                  Pair var4x;
                  try (Reader $$2x = $$3.getValue().e()) {
                     gir $$3x = gir.a($$2x);
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

   private gzl a(gzt $$0, Map<alc, gzt> $$1, gzf.c $$2) {
      gzl $$3 = new gzl($$1, $$0);
      $$3.a($$2);
      $$3.a();
      return $$3;
   }

   private static CompletableFuture<gzf.c> a(gzf $$0, aut $$1, Executor $$2) {
      Function<alc, dup<dhj, duo>> $$3 = gzf.a();
      return CompletableFuture.<Map<alc, List<aur>>>supplyAsync(() -> b.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<gzf.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<alc, List<aur>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               alc $$3xx = b.b($$5.getKey());
               dup<dhj, duo> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<aur> $$5x = $$5.getValue();
                  List<gzf.a> $$6 = new ArrayList<>($$5x.size());

                  for (aur $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = ayt.a($$8);
                        gis $$10 = gis.a($$9);
                        $$6.add(new gzf.a($$7.b(), $$10));
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
            Map<gzo, gzf.b> $$1xx = new HashMap<>();

            for (gzf.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new gzf.c($$1xx);
         });
      });
   }

   private gzn.a a(bod $$0, Map<alc, gzc.b> $$1, gzk $$2, Object2IntMap<duo> $$3) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<gzo, gzh> $$4 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gzc.b $$4x = $$1.get($$3x.a());
         gxb $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gzh.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<gzo, gzd> $$5 = $$2.a();
      gzd $$6 = $$5.get(gzi.c);
      Map<duo, gzd> $$7 = new IdentityHashMap<>();

      for (dhj $$8 : lu.e) {
         $$8.n().a().forEach($$3x -> {
            alc $$4x = $$3x.b().s().h().a();
            gzd $$5x = $$5.getOrDefault(gii.a($$4x, $$3x), $$6);
            $$7.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$9 = CompletableFuture.allOf($$1.values().stream().map(gzc.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gzn.a($$2, $$3, $$6, $$7, $$1, $$9);
   }

   private static Object2IntMap<duo> a(fjn $$0, gzf.c $$1) {
      return gzm.a($$0, $$1);
   }

   private void a(gzn.a $$0, bod $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.e.values().forEach(gzc.b::c);
      gzk $$2 = $$0.a;
      this.e = $$2.a();
      this.k = $$0.b;
      this.j = $$0.c;
      $$1.b("cache");
      this.g.a($$0.d);
      $$1.c();
      $$1.b();
   }

   public boolean a(duo $$0, duo $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.k.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.k.getInt($$1);
            if ($$2 == $$3) {
               eqp $$4 = $$0.y();
               eqp $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gxa a(alc $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   static record a(gzk a, Object2IntMap<duo> b, gzd c, Map<duo, gzd> d, Map<alc, gzc.b> e, CompletableFuture<Void> f) {
   }
}
